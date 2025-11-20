package org.example.enrollmentservice.repositories;

import org.example.enrollmentservice.entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
