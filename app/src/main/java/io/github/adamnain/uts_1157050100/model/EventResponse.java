package io.github.adamnain.uts_1157050100.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EventResponse {

    @SerializedName("events")
    @Expose
    private List<Event> events = null;

    public EventResponse() {
    }

    public EventResponse(List<Event> events) {
        super();
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

}