package com.marcosDovilio.montadora.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository todoRepository;

    public TodoValidator(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void validar(TodoEntity todoEntity){
        if(existeMesmaDesc(todoEntity.getDescricao())){
            throw new IllegalArgumentException("A descrição já foi inserida em outro todo!");
        }
    }

    private boolean existeMesmaDesc(String descricao){
        return todoRepository.existsByDescricao(descricao);
    }
}

