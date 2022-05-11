package com.janqa.av.scheduler;

import com.janqa.av.model.response.Advert;
import com.janqa.av.model.response.Property;
import com.janqa.av.service.AVClient;
import com.janqa.av.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Component
public class Scheduler {
    @Autowired
    private AVClient avClient;
    @Autowired
    private AdvertService advertService;


    //@Scheduled(fixedRate = 1, timeUnit = TimeUnit.HOURS)
    public void run() {
        avClient.findAllCars()
                .sequential()
                .doOnNext(advertService::save)
                .map(Advert::getProperties)
                .map(list -> list.stream().filter(p -> p.getName().equals("brand")).findAny().orElseGet(null))
                .map(Property::getValue)
                .distinct()
                .subscribe(System.out::println);
    }

    @Scheduled(fixedRate = 1, timeUnit = TimeUnit.HOURS)
    public void search2() {
        avClient.findAllCars()
                .sequential()
                .filter(Objects::nonNull)
                .map(Advert::getDescription)
                .subscribe(System.out::println);
    }
}
