package ru.star.startask.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.star.startask.Entity.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
}
