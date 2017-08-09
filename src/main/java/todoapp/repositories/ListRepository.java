package todoapp.repositories;

import org.springframework.data.repository.CrudRepository;

import todoapp.model.TodoList;

/**
 * ListRepository
 */
public interface ListRepository extends CrudRepository<TodoList, Long> {
  
}