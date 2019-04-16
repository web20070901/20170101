package com.wangyulong.dao.Impl;

import com.wangyulong.TbGoods;
import com.wangyulong.dao.IGoodsDAO;
import com.wangyulong.mapper.GoodsMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GoodsDAO implements IGoodsDAO {

    @Autowired
    private SqlSession session;

    @Override
    public TbGoods queryGoodsById(Long goodsId) {
        TbGoods tbGoods = session.getMapper(GoodsMapper.class).queryGoodsById(goodsId);
        return tbGoods;
    }
}
