package com.janqa.av;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
//@EnableMongoRepositories
@EnableScheduling
public class App {
    public static final String BASE = "https://api.av.by";

    public static void main(String... args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public WebClient webClient() {
        final int size = 16 * 1024 * 1024;
        final ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(size))
                .build();
        return WebClient.builder()
                .exchangeStrategies(strategies)
                .baseUrl(BASE)
                .build();
    }

}
