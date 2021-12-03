package co.com.sofka.models.hu06;

import java.util.List;

public class CategoriesItem{
	private List<String> urlsRefGradles;
	private int days;
	private String categoryName;
	private String categoryId;

	public List<String> getUrlsRefGradles(){
		return urlsRefGradles;
	}

	public int getDays(){
		return days;
	}

	public String getCategoryName(){
		return categoryName;
	}

	public String getCategoryId(){
		return categoryId;
	}
}