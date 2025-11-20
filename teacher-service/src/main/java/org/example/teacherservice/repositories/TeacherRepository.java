package org.example.teacherservice.repositories;

import org.example.teacherservice.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
