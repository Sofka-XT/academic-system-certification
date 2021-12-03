package co.com.sofka.models.hu06;

import java.util.List;

public class CoursesItem{
	private String courseName;
	private List<CategoriesItem> categories;
	private String courseId;

	public String getCourseName(){
		return courseName;
	}

	public List<CategoriesItem> getCategories(){
		return categories;
	}

	public String getCourseId(){
		return courseId;
	}
}