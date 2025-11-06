package org.myapp.core.java.immutable.record_java14;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public record Employee(int id, String name, Address address, List<Skill> skills) {

    public Employee {
        // Validation
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        if (skills == null) {
            throw new IllegalArgumentException("Skills cannot be null");
        }

        // Defensive copies for deep immutability
        address = new Address(address.city(), address.state()); // copy
        skills = List.copyOf(skills); // copy + unmodifiable
    }
}
