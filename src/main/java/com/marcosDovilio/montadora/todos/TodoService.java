package com.marcosDovilio.montadora.todos;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class TodoService {

    private final TodoRepository todoRepository;
    private final TodoValidator validator;

    public TodoService(TodoRepository todoRepository, TodoValidator validator) {

        this.todoRepository = todoRepository;
        this.validator = validator;
    }

    public TodoEntity salvar(TodoEntity todoEntity) {
        validator.validar(todoEntity);
        return todoRepository.save(todoEntity);
    }

    public TodoEntity atualizarTodo(TodoEntity todoEntity){
        return todoRepository.save(todoEntity);
    }

    public TodoEntity buscar(Integer id){
        return todoRepository.findById(id).orElse(null);
    }
}
