package todoapp.services;

import java.util.List;

import todoapp.model.TodoItem;
import todoapp.model.TodoList;

/**
 * ListService
 */
public interface ListService {

  List<TodoItem> listAll();
  TodoList getById(Long id);

  TodoList saveOrUpdate(TodoList list);

  void delete(Long id);

  TodoList saveOrUpdateTodoList(TodoItem item);
  
}