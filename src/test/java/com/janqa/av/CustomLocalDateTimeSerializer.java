package com.janqa.av;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer;

import java.time.format.DateTimeFormatter;

public class CustomLocalDateTimeSerializer extends OffsetDateTimeSerializer {
    private static String PATTERN = "dd/MM/yyyy HH:mm:ss XXX";


}
