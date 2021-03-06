package com.zeasn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.zeasn.bean.Pic;

public interface PicMapper {
	int insPic(Pic pic);
	@Select("select * from pic")
	List<Pic> selAll();
	@Delete("delete from pic where id=#{0}")
	int delByid(int id);
}
