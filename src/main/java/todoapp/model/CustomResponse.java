package todoapp.model;

public class CustomResponse {

	private Object payload;

	public CustomResponse(Object payload) {
		super();
		this.payload = payload;
	}

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}

   
}