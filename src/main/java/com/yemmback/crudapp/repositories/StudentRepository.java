package com.yemmback.crudapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yemmback.crudapp.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
