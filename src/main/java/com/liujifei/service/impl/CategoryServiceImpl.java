package com.liujifei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liujifei.dao.CategoryMapper;
import com.liujifei.entity.Category;
import com.liujifei.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryMapper categoryMapper; 
	
	@Override
	public List<Category> getCategoryByChId(Integer cid) {
		// TODO Auto-generated method stub
		return categoryMapper.getCategoryByChId(cid) ;
	}

}
