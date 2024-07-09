package com.project.planner.trip;

import java.util.List;

public record TripRequestPayload(String destination, String startsAt, String endsAt, List<String> emails_to_invite, String owner_email, String owner_name) {



}
