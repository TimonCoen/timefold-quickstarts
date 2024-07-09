package org.acme.vehiclerouting.solver.justifications;

import ai.timefold.solver.core.api.score.stream.ConstraintJustification;

public record LastDepartureTimeJustification(String vehicleId, long departureDifferenceTimeInMinutes,
                                           String description) implements ConstraintJustification {

    public LastDepartureTimeJustification(String vehicleId, long departureDifferenceTimeInMinutes) {
        this(vehicleId, departureDifferenceTimeInMinutes, "Vehicle '%s' exceeded its max departure time by %s minutes."
                .formatted(vehicleId, departureDifferenceTimeInMinutes));
    }
}
