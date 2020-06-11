package com.mybatisstudy.repository;

import com.mybatisstudy.entity.Goods;

public interface GoodsRepository {
    Goods findById(long id);
}
