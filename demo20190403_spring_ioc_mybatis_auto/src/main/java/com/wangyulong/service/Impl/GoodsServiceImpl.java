package com.wangyulong.service.Impl;

import com.wangyulong.dao.GoodsMapper;
import com.wangyulong.info.TbGoods;
import com.wangyulong.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public TbGoods queryGoodsById(Long goodsId) {
        return goodsMapper.queryGoodsById(goodsId);
    }
}
