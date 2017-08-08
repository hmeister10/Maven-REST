package todoapp.controller;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import todoapp.model.TodoResponse;
import todoapp.model.CustomResponse;
import todoapp.model.NewItem;
import todoapp.model.TodoItem;
import todoapp.model.TodoList;

@Controller
@RequestMapping("/list")
public class todoAppController {

    TodoList list = new TodoList();
    private final AtomicLong counter = new AtomicLong();

    
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Object showList() { 
      return new CustomResponse(new TodoResponse(list.get()));
    }

    @RequestMapping(method=RequestMethod.POST)
    @ResponseBody ResponseEntity<Void> addToList( @RequestBody NewItem item) throws Exception {
      System.out.println("Payload is::");
      System.out.println(item);

      try {
        TodoItem newItem = new TodoItem(counter.incrementAndGet(), item.getContent());
        list.add(newItem);
        return new ResponseEntity<Void>(HttpStatus.CREATED);

      } catch(Exception e) {
        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }


    @RequestMapping(method=RequestMethod.DELETE)
    public @ResponseBody ResponseEntity<Void> deleteFromList(
      @RequestParam(
        value="id", required=true) long id
        ) {
          System.out.println("REMOVING ITEM WITH ID::" + id);
          
          if(list.remove(id)) {
            return new ResponseEntity<Void>(HttpStatus.OK);
          } else {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
          }
    }
    
    
}