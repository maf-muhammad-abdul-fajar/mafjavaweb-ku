package com.juaracoding._01JavaWeb.repo;

import com.juaracoding._01JavaWeb.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
