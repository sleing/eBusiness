package com.ebus.dao.admin;

import java.util.List;

import com.ebus.entity.GoodsType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ebus.entity.Goods;

@Mapper
public interface TypeRepository {
	int selectAll();
	List<GoodsType> selectAllTypeByPage(@Param("startIndex") int startIndex, @Param("perPageSize") int perPageSize);
	int deleteType(int id);
	List<Goods> selectGoods(int goodstype_id);
	int addType(GoodsType goodsType);
}
