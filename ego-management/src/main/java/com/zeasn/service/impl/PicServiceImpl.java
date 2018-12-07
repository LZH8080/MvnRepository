package com.zeasn.service.impl;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.zeasn.bean.Pic;
import com.zeasn.mapper.PicMapper;
import com.zeasn.service.PicService;

@Service
public class PicServiceImpl implements PicService{
	@Resource
	private PicMapper picMapper;

	@Override
	public int insPic(Pic pic) {
		return picMapper.insPic(pic);
	}

	@Override
	public List<Pic> selAll() {
		return picMapper.selAll();
	}

	@Override
	public int delByid(int id) {
		return picMapper.delByid(id);
	}
}
