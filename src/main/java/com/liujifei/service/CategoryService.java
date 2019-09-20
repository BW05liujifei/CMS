package com.liujifei.service;

import java.util.List;

import com.liujifei.entity.Category;

public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
