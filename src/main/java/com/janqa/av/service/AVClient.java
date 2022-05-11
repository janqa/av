package com.janqa.av.service;

import com.janqa.av.AVClientConfig;
import com.janqa.av.model.request.Request;
import com.janqa.av.model.response.Advert;
import com.janqa.av.model.response.Response;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.ParallelFlux;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.stream.IntStream;

@Service
public class AVClient {

    private WebClient webClient;
    private AVClientConfig config;

    public AVClient(WebClient webClient, AVClientConfig config) {
        this.webClient = webClient;
        this.config = config;
    }

    public ParallelFlux<Advert> findAllCars() {
        return findAllCarsWithDelay(config.getDelayMillisec());
    }

    private ParallelFlux<Advert> findAllCarsWithDelay(int delay) {
        return webClient.post().uri(config.getPath())
                .bodyValue(new Request(1))
                .retrieve()
                .bodyToMono(Response.class)
                .map(Response::getPageCount)
                .flatMapMany(i -> Flux.fromStream(IntStream.rangeClosed(1, i).mapToObj(Request::new)))
                .delayElements(Duration.ofMillis(delay))
                .parallel()
                .runOn(Schedulers.boundedElastic())
                .flatMap(r -> webClient.post().uri(config.getPath())
                        .bodyValue(r)
                        .retrieve()
                        .bodyToMono(Response.class)
                        .map(Response::getAdverts)
                        .flatMapMany(Flux::fromIterable));
    }
}
