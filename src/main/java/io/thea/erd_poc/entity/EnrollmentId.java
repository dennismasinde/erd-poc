package io.thea.erd_poc.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class EnrollmentId implements Serializable {

    private Long studentId;
    private Long courseId;

    // Getters, Setters, hashCode, and equals methods
}
