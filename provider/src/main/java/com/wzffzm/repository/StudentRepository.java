package com.wzffzm.repository;

import com.wzffzm.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    Collection<Student> findAll();

    Student findById(Long id);

    void saveOrUpdate(Student student);

    void deleteById(Long id);
}
