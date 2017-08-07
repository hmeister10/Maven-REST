package todoapp.model;

public class TodoItem {

    private final long id;
    private final String content;

    public TodoItem(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}