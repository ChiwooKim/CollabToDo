package com.collabtodo.collabtodo_backend.repository;

import com.collabtodo.collabtodo_backend.domain.Todo;
import com.collabtodo.collabtodo_backend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findByUser(User user);
}
