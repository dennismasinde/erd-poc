package io.thea.erd_poc.repository;

import io.thea.erd_poc.entity.Enrollment;
import io.thea.erd_poc.entity.EnrollmentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentId> {
}
