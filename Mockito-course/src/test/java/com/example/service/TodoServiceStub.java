package com.example.service;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

    //Dynamic condition
    //service definition
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring","Learn to Dance");
    }

    @Override
    public void deleteTodo(String todo) {

    }
}
