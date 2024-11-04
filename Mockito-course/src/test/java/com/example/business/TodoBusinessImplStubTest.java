package com.example.business;

import com.example.service.TodoService;
import com.example.service.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodoRelatedToSpring(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }
}
