package com.ebus.dao.before;

import java.util.List;

import com.ebus.entity.GoodsType;
import org.apache.ibatis.annotations.Mapper;

import com.ebus.entity.Goods;

@Mapper
public interface IndexRepository {
	public List<Goods> selectAdvertisementGoods();
	public List<GoodsType> selectGoodsType();
	public List<Goods> selectRecommendGoods(Integer tid);
	public List<Goods> selectLastedGoods(Integer tid);
	public Goods selectAGoods(Integer id);
	public List<Goods> search(String mykey);
}
