package janqa.rasp.model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Context {
    public ArrayList<String> transportTypes;
    public Original search;
    public ZonedDateTime latestDatetime;
    public boolean isChanged;
    public Original original;
}
