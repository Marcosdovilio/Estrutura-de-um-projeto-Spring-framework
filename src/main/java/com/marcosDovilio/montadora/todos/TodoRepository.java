package com.marcosDovilio.montadora.todos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
    Boolean existsByDescricao(String descricao);
}
