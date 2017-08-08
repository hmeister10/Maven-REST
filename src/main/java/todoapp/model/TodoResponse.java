package todoapp.model;

import java.util.List;

public class TodoResponse {

    private List<TodoItem> data;
    
	public TodoResponse(List<TodoItem> data) {
		super();
		this.data = data;
	}

	public List<TodoItem> getData() {
		return data;
	}

	public void setData(List<TodoItem> data) {
		this.data = data;
	}


   
}