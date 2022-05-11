package com.janqa.av;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CustomDeserializer extends JsonDeserializer {
    @Override public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JacksonException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        var local = LocalDateTime.from(formatter.parse(jsonParser.getValueAsString()));
        return ZonedDateTime.of(local, ZoneId.of("Asia/Dubai")).toOffsetDateTime();
    }
}
