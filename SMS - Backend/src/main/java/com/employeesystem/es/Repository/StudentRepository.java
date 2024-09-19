package com.employeesystem.es.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.employeesystem.es.Entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
