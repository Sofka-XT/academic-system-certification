package co.com.sofka.models.hu05.filterId;

import java.util.List;

public class CategoriesItem{
	private String name;
	private List<RulesItem> rules;
	private String id;

	public String getName(){
		return name;
	}

	public List<RulesItem> getRules(){
		return rules;
	}

	public String getId(){
		return id;
	}
}