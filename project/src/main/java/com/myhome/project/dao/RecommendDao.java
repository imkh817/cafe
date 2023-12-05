package com.myhome.project.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.myhome.project.model.Recommend;

@Mapper
public interface RecommendDao {

	int getTotal();

	List<Map<String, Object>> getList(Recommend recommend);


}
