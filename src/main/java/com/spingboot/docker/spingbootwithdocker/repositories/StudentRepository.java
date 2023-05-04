package com.spingboot.docker.spingbootwithdocker.repositories;

import com.spingboot.docker.spingbootwithdocker.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
