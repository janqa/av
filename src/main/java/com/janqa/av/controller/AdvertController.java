package com.janqa.av.controller;

import com.janqa.av.model.response.Advert;
import com.janqa.av.model.response.Property;
import com.janqa.av.service.AVClient;
import com.janqa.av.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.Year;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cars")
public class AdvertController {
    @Autowired private AVClient avClient;
    @Autowired AdvertService advertService;

    @GetMapping("/models")
    public ResponseEntity<Object> getCarModels() {
        var col = advertService.findAll()
                .stream().collect(Collectors.groupingBy(this::mapToCarProperties,
                        Collectors.mapping(this::mapToPair, Collectors.toUnmodifiableList())));
        var entry = col.entrySet().stream().reduce((e1, e2) -> e1.getValue().size() > e2.getValue().size() ? e1 : e2);
        return ResponseEntity.ok(entry);
    }

    private CarProperties mapToCarProperties(Advert advert) {
        CarProperties properties = new CarProperties();
        properties.setBrand(this.<String>getProperty(advert, "brand").orElseThrow());
        properties.setModel(this.<String>getProperty(advert, "model").orElseThrow());
        properties.setGeneration(this.<String>getProperty(advert, "generation").orElse(null));
        return properties;
    }

    private <T> Optional<T> getProperty(Advert advert, String name) {
        return advert.getProperties().stream()
                .filter(p -> p.getName().equals(name))
                .map(Property::getValue)
                .map(o -> (T) o).findAny();
    }

    private Pair mapToPair(Advert advert) {
        return new Pair(Year.of(advert.getYear()), new BigDecimal(advert.getPrice().getUsd().getAmount()));
    }

    class Pair {
        private Year year;
        private BigDecimal price;

        public Pair(Year year, BigDecimal price) {
            this.year = year;
            this.price = price;
        }

        public Year getYear() {
            return year;
        }

        public void setYear(Year year) {
            this.year = year;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }
    }
}
