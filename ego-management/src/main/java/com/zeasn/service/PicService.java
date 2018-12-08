package com.zeasn.service;

import java.util.List;

import com.zeasn.bean.Pic;

public interface PicService {
	int insPic(Pic pic);
	List<Pic> selAll();
	int delByid(int id);
}
