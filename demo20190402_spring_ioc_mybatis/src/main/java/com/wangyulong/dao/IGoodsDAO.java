package com.wangyulong.dao;

import com.wangyulong.TbGoods;

public interface IGoodsDAO {

    TbGoods queryGoodsById(Long goodsId);
}
