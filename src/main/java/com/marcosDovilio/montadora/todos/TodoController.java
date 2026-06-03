package com.marcosDovilio.montadora.todos;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todoEntity){
        try {
        return this.todoService.salvar(todoEntity);
        } catch (IllegalArgumentException e) {
            var mensagem = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, mensagem);
        }
    }

    @PutMapping("{id}")
    public TodoEntity atualizarTodo(
            @PathVariable("id") Integer id, @RequestBody TodoEntity todoEntity
    ){
        todoEntity.setId(id);
        return todoService.salvar(todoEntity);

    }

    @GetMapping("{id}")
    public TodoEntity buscar(@PathVariable("id") Integer id){
        return todoService.buscar(id);
    }
}
