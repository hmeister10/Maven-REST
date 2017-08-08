package todoapp.model;

public class NewItem {

    private String content;

    public NewItem() {
      super();
    }
    public NewItem(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}