package com.janqa.av;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.InstantSerializer;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Optional;
import java.util.TimeZone;

class AppTest {
    @Test public void tt() {
        Optional.of("").map(this::map).map(BigDecimal::new).orElseGet(() -> new BigDecimal("9"));
    }

    @Test public void ee() throws JsonProcessingException {
        //TimeZone.setDefault(TimeZone.getTimeZone(TimeZone.getAvailableIDs()[19]));
        System.out.println(TimeZone.getDefault());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        var mod=new SimpleModule();
        mod.addSerializer(InstantSerializer.INSTANCE);
        objectMapper.registerModule(mod);
        objectMapper.setTimeZone(TimeZone.getDefault());
        var s1 = "{\"time\":\"2022-05-20T03:27:01+04:00\"}";
        var obj = objectMapper.readValue(s1, Timed.class);
        //var o = new Timed(OffsetDateTime.now());
        var str = objectMapper.writeValueAsString(obj);
        System.out.println(str);
        System.out.println(obj.getTime());
        DateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    private String map(String s) {
        return null;
    }
}