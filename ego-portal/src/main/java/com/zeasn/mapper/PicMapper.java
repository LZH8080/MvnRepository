package com.zeasn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zeasn.bean.Pic;

public interface PicMapper {
	@Select("select * from pic")
	List<Pic> selAll();

}
