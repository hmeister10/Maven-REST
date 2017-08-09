package todoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import todoapp.model.TodoList;

/**
 * ListRepository
 * @param <TodoList>
 */
public interface ListRepository<TodoList> extends CrudRepository<TodoList, Long> {
  
}