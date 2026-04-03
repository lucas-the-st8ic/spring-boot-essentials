package br.com.lucas.spring_boot_essentials.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {

 /*   @GetMapping
    public String helloWorld() {
        return "Hello World";
    }*/

 /*   @GetMapping
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello, World!")
    }*/

  /*  @PostMapping
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }*/

    /*@GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String get() {
        return "Hello, World!";
    }*/

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String get() {
        return "Hello, World!";
    }
}
