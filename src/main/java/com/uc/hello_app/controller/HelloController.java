package com.uc.hello_app.controller;
import com.uc.hello_app.DTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    @GetMapping("/hello/query")
    public String sayHelloName(@RequestParam String name) {

        return "Hello "+ name;
    }

    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/post")
    public String sayHelloRequestBody(@RequestBody DTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }




}
