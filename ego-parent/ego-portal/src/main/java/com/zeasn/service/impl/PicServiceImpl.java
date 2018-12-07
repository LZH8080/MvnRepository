package com.zeasn.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.zeasn.bean.Pic;
import com.zeasn.mapper.PicMapper;
import com.zeasn.service.PicService;

@Service
public class PicServiceImpl implements PicService{
	@Resource
	private PicMapper picMapper;
	
	@Value("${management.url}")
	private String path;
	@Override
	public List<Pic> selAll() {
		List<Pic> list = picMapper.selAll();
		for (Pic pic : list) {
			pic.setPath(path+pic.getPath());
		}
		return list;
	}
	

}
