package com.example.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;

@Entity
public class EventDetails extends AbstractEntity{

    @Size(max = 500, message = "Description is too long.")
    private String description;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message="Location is required.")
    private String location;

    @AssertTrue(message = "Cannot be false")
    private boolean registrationRequired;

    @Positive(message="Number of attendees must be one or more.")
    private int numberOfAttendees;

    public EventDetails() {
    }

    public EventDetails(String description, String contactEmail, String location, boolean registrationRequired, int numberOfAttendees) {
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.registrationRequired = registrationRequired;
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public void setRegistrationRequired(boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public boolean isRegistrationRequired() {
        return registrationRequired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
