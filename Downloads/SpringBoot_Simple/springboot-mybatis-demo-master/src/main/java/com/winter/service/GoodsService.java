package com.winter.service;

import com.winter.model.Goods;

import java.util.List;


public interface GoodsService {
    int addGoods(Goods goods);

    List<Goods> getAllGoods(int pageNum, int pageSize);
}
