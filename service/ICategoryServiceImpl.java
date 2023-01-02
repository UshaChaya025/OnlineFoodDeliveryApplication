package com.cg.ofda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ofda.dto.CategoryDto;
import com.cg.ofda.repository.ICategoryRepository;
@Service
public class ICategoryServiceImpl implements ICategoryService {
	@Autowired
	ICategoryRepository categoryRepository;
	
	@Override
	public CategoryDto addCategory(CategoryDto cat) {
			categoryRepository.save(cat);
		return cat;
	}

	@Override
	public CategoryDto updateCategory(CategoryDto cat) {
		categoryRepository.save(cat);
		return cat;
	}

	@Override
	public CategoryDto removeCategory(String catId) {
		CategoryDto cat = categoryRepository.findById(catId).get();
		categoryRepository.delete(cat);
		return cat;
	}

	@Override
	public CategoryDto viewCategory(String catId) {
		return categoryRepository.findById(catId).get();
	}

	@Override
	public List<CategoryDto> viewAllCategory() {
		List<CategoryDto> cts = categoryRepository.findAll();
		return cts;
	}

}
