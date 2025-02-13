package com.example.codingevents.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

@Entity
public class Event extends AbstractEntity {

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name should be within a range between 3 and 50.")
    private String name;

    @ManyToOne
    @NotNull(message = "Field is required")
    private EventCategory category;//one category for an event

    @OneToOne(cascade = CascadeType.ALL)//say save this object with every saved event object
    @Valid//allows to enforce validation rules that are inside this class EventDetails
    @NotNull
    private EventDetails eventDetails;

    public Event(String name, EventCategory category) {
        this.name = name;
        this.category = category;
    }

    public Event(){

    }

    public EventCategory getCategory() {
        return category;
    }

    public void setCategory(EventCategory eventCategory) {
        this.category = eventCategory;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                '}';
    }
}
