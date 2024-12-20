package com.example.codingevents.data;

import com.example.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    private static final Map<Integer, Event> EVENTS = new HashMap<>();

    public static Collection<Event> getAll() {
        return EVENTS.values();
    }

    public static void add(Event event) {
        EVENTS.put(event.getId(), event);
    }

    public static Event getById(int id) {
        return EVENTS.get(id);
    }

    public static void remove(int id) {
        if (EVENTS.containsKey(id)) {
            EVENTS.remove(id);
        }
    }
}
