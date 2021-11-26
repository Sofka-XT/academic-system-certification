package co.com.sofka.models.hu05;

import java.util.List;

public class ResponseItem{
	private String name;
	private String id;
	private List<CategoriesItem> categories;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCategories(List<CategoriesItem> categories){
		this.categories = categories;
	}

	public List<CategoriesItem> getCategories(){
		return categories;
	}
}