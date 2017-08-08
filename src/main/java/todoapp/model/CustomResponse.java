package todoapp.model;

public class CustomResponse {

    private Object data;

    public CustomResponse(Object list) {
        this.data = list;
    }

    public Object get() {
        return this.data;
        
    }

}