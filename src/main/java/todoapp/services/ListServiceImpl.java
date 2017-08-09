package todoapp.services;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Path.ReturnValueNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todoapp.model.TodoItem;
import todoapp.model.TodoList;
import todoapp.repositories.ListRepository;

/**
 * ListService
 */
@Service
public class ListServiceImpl implements ListService {

  private ListRepository<TodoList> listRepository;

  @Autowired
  public ListServiceImpl(ListRepository<TodoList> listRepository) {
    this.listRepository = listRepository;
  }

  @Override
  public List<TodoItem> listAll() {

    List<TodoItem> todoList = new ArrayList<TodoItem>();
    listRepository.findAll().forEach(todoList::add);
    return todoList;
  }

  @Override
  public TodoList getById(Long id) {
    TodoList todoList = new TodoList();
    return todoList;
  }

  @Override
  public TodoList saveOrUpdate(TodoList list) {
    TodoList todoList = new TodoList();
    return todoList;
  }

  @Override
  public void delete(Long id) {

  }

  @Override
  public TodoList saveOrUpdateTodoList(TodoItem item) {
    TodoList todoList = new TodoList();
    return todoList;
  }
  

}