package todoapp.model;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TodoList {

    private final ArrayList<TodoItem> list  =new ArrayList<TodoItem>();

    public TodoList() {
    }

    public ArrayList<TodoItem> add(TodoItem item) {
        this.list.add(item);
        return this.list;
    }
    
    public ArrayList<TodoItem> get(String id) {

      return this.list;
    }

    public ArrayList<TodoItem> get() {
      return this.list;
    }

    public boolean remove(long id) {
      Predicate<TodoItem> itemPredicate = item -> item.getId() == id;
      try {
        list.removeIf(itemPredicate);
        return true;
      } catch(Exception e) {
        return false;
      }
    }


}