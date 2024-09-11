package com.melihyelman.springboot.first_web_app.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private static List<Todo> todos;

    static {
        todos.add(new Todo(1, "melihyelman", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "melihyelman", "Learn Azure", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "melihyelman", "Learn Full Stack", LocalDate.now().plusYears(3), false));

    }
    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
