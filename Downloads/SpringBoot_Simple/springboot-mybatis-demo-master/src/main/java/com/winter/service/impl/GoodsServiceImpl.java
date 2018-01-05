package com.winter.service.impl;

import com.github.pagehelper.PageHelper;
import com.winter.mapper.GoodsMapper;
import com.winter.model.Goods;
import com.winter.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public int addGoods(Goods goods) {
        return goodsMapper.insertSelective(goods);
    }

    @Override
    public List<Goods> getAllGoods(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return goodsMapper.selectAllGoods();
    }
}
