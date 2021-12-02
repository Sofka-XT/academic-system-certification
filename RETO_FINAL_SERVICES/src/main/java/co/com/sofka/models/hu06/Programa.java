package co.com.sofka.models.hu06;

import java.util.List;

public class Programa{
	private List<Courses> courses;
	private String name;
	private String id;

	public List<Courses> getCourses(){
		return courses;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}
}