package co.com.sofka.models.hu05;

public class RulesItem{
	private Feedback feedback;
	private String average;
	private String condition;
	private String type;

	public void setFeedback(Feedback feedback){
		this.feedback = feedback;
	}

	public Feedback getFeedback(){
		return feedback;
	}

	public void setAverage(String average){
		this.average = average;
	}

	public String getAverage(){
		return average;
	}

	public void setCondition(String condition){
		this.condition = condition;
	}

	public String getCondition(){
		return condition;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}
