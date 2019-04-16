package com.wangyulong.mapper;

import com.wangyulong.TbGoods;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {

    TbGoods queryGoodsById(@Param("goodsId") Long id);
}
