package co.com.sofka.models.hu02;

import java.util.List;

import lombok.Data;

public @Data class CoursesItem{
	private String courseName;
	private List<CategoriesItem> categories;
	private String courseId;
}