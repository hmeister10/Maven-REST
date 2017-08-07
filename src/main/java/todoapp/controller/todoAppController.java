package todoapp.controller;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import todoapp.model.TodoItem;
import todoapp.model.TodoList;

@Controller
@RequestMapping("/list")
public class todoAppController {

    TodoList list = new TodoList();
    private final AtomicLong counter = new AtomicLong();

    
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody ArrayList<TodoItem> showList(
      @RequestParam(
        value="id",
        required=false,
        defaultValue="TEST") String content) 
        {
         if(content != "") {
          TodoItem item = new TodoItem(counter.incrementAndGet(), content);
          return list.add(item);
         } else {
           return list.get();
         }
          
        }
}