package com.mosoftvn.service;

import java.util.List;

import com.mosoftvn.models.Category;

public interface CategoryService {
	List<Category> getAll();
	Boolean create(Category category);
	Category findById(Integer id);
	Boolean update(Category category);
	Boolean delete(Integer id);
}
