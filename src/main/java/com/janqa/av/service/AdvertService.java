package com.janqa.av.service;

import com.janqa.av.model.response.Advert;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class AdvertService {

    public Collection<Advert> findAll() {
        return Collections.emptySet();
    }

    public void save(Advert advert) {
    }
}
