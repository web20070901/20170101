package com.wangyulong.dao;

import com.wangyulong.info.TbGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsMapper {

    TbGoods queryGoodsById(@Param("goodsId") Long goodsId);
}
