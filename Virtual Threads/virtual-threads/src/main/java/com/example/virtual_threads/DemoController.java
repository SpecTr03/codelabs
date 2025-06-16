package com.example.virtual_threads;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class DemoController {

    @GetMapping("/slow")
    public ResponseEntity<String> slowEndpoint() throws InterruptedException {
        log.info("Ejecutando en hilo: {}", Thread.currentThread());
        Thread.sleep(2000); // Simula tarea bloqueante
        System.out.println("Hello from thread: " + Thread.currentThread().getName() + " (Virtual: " + Thread.currentThread().isVirtual() + ")");
        return ResponseEntity.ok("Procesado por hilo: " + Thread.currentThread().getName());
    }
}