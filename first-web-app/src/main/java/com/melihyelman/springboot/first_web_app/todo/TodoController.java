package com.melihyelman.springboot.first_web_app.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model)      {
        List<Todo> todos = todoService.findByUsername("melihyelman");
        model.addAttribute("todos",todos);
        return "listTodos";
    }
}
