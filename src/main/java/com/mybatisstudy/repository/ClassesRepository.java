package com.mybatisstudy.repository;

import com.mybatisstudy.entity.Classes;

public interface ClassesRepository {
    Classes findById(long id);
    Classes findByIdLazy(long id);
}
