package co.com.sofka.models.hu05.filterId;

import java.util.List;

public class Response{
	private String name;
	private String id;
	private List<CategoriesItem> categories;

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public List<CategoriesItem> getCategories(){
		return categories;
	}
}