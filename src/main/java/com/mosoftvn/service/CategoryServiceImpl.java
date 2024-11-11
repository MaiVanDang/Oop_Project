package com.mosoftvn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mosoftvn.models.Category;
import com.mosoftvn.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return this.categoryRepository.findAll();
	}

	@Override
	public Boolean create(Category category) {
	    try {
	            this.categoryRepository.save(category);
	            return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	@Override
	public Category findById(Integer id) {
		return this.categoryRepository.findById(id).get();
	}

	// Phương thức cập nhật
	public Boolean update(Category category) {
	    try {
	            this.categoryRepository.save(category);
	            return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	@Override
	public Boolean delete(Integer id) {
		try {
			this.categoryRepository.delete(findById(id));
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
