package org.myapp.core.java.immutable.record_java14;

import java.util.List;
import java.util.ArrayList;

public record Employee(String name, List<String> skills) {
    public Employee {
        // Defensive copy in constructor
        skills = List.copyOf(skills);
    }

    // Optional: defensive copy in accessor (if deeper mutability is a concern)
    public List<String> skills() {
        return new ArrayList<>(skills);
    }
}
