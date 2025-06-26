package com.dgsw.skew.controller;


import com.dgsw.skew.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class SkewController {
    @Autowired
    private TodoService skewService;

    @GetMapping("/todos")
    public ResponseEntity<String> getTodos() {
        return ResponseEntity.ok("");
    }

    @PostMapping("/todos")
    public ResponseEntity<String> makeTodos() {
        return ResponseEntity.ok("");
    }

    @GetMapping("/todos/{id}")
    public ResponseEntity<String> getTodo() {
        return ResponseEntity.ok("");
    }

    @PutMapping("/todos/{id}")
    public ResponseEntity<String> editTodo() {
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/todos/{id}")
    public ResponseEntity<String> delTodo() {
        return ResponseEntity.ok("");
    }

    @PatchMapping("/todos/order")
    public ResponseEntity<String> reorderTodo() {
        return ResponseEntity.ok("");
    }

    @PatchMapping("/todos/{id}/toggle")
    public ResponseEntity<String> toggleTodo() {
        return ResponseEntity.ok("");
    }
}
