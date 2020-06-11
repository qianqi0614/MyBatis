package com.mybatisstudy.repository;

import com.mybatisstudy.entity.Student;

public interface StudentRepository {
    Student findById(long id);
    Student findByIdLazy(long id);
}
