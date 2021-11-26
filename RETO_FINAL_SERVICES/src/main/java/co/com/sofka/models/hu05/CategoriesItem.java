package co.com.sofka.models.hu05;

import java.util.List;

public class CategoriesItem{
	private String name;
	private List<RulesItem> rules;
	private String id;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRules(List<RulesItem> rules){
		this.rules = rules;
	}

	public List<RulesItem> getRules(){
		return rules;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}
}