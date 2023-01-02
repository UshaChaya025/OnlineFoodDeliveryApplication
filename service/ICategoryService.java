package com.cg.ofda.service;

import java.util.List;

import com.cg.ofda.dto.CategoryDto;


public interface ICategoryService {
	public CategoryDto addCategory(CategoryDto cat);
	public CategoryDto updateCategory(CategoryDto cat);
	public CategoryDto removeCategory(String catId);
	public CategoryDto viewCategory(String catId);
	public List<CategoryDto> viewAllCategory();

}
