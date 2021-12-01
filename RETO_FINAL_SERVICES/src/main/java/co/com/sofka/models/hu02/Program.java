package co.com.sofka.models.hu02;

import java.util.List;
import lombok.Data;

public @Data class Program{

	private List<CoursesItem> courses;
	private String name;
	private String id;
}