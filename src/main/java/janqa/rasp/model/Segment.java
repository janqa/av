package janqa.rasp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class Segment {
    public LocalDate startDate;
    public String number;
    public String departureEventKey;
    public String stops;
    public int duration;
    public String arrivalEventKey;
    public Transport transport;
    public String title;
    public ZonedDateTime arrivalLocalDt;
    public Station stationTo;
    public ZonedDateTime arrival;
    public boolean isThroughTrain;
    public Object departureEvent;
    public Company company;
    public Object suburbanFacilities;
    public ZonedDateTime departureLocalDt;
    public boolean isInterval;
    public Object arrivalEvent;
    public ArrayList<String> tariffsKeys;
    public Thread thread;
    public LocalDateTime departure;
    public boolean hasTrainTariffs;
    public Station stationFrom;
    public boolean isMetaSegment;
}
