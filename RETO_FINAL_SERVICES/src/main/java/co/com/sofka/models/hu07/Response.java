package co.com.sofka.models.hu07;

import java.io.Serializable;
import java.util.List;

public class Response implements Serializable {
	private List<ResponseItem> response;

	public List<ResponseItem> getResponse(){
		return response;
	}
}