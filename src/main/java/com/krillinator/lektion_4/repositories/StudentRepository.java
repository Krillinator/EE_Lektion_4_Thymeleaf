package com.krillinator.lektion_4.repositories;

import com.krillinator.lektion_4.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
