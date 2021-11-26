package co.com.sofka.models.hu05;

public class Feedback{
	private String name;
	private Object uri;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUri(Object uri){
		this.uri = uri;
	}

	public Object getUri(){
		return uri;
	}
}
