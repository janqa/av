package com.janqa.av;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.TimeZone;

class Timed {
    public final static String ZONE_ID = TimeZone.getDefault().getID();
    private Instant time;

    public Timed() {
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }
}
