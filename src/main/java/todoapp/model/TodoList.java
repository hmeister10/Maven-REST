package todoapp.model;

import java.util.ArrayList;

public class TodoList {

    private final ArrayList<TodoItem> list  =new ArrayList<TodoItem>();

    public TodoList() {
    }

    public ArrayList<TodoItem> add(TodoItem item) {
        this.list.add(item);
        return this.list;
    }
    
    public ArrayList<TodoItem> get() {
      return this.list;
    }


}