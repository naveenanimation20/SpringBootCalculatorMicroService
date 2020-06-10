package com.calculator.service.calcservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {


    @GetMapping("/add/{x}/{y}")
    public Response add(@PathVariable int x, @PathVariable  int y){
        return new Response(x, y, x+y);
    }

    @GetMapping("/sub/{x}/{y}")
    public Response sub(@PathVariable int x, @PathVariable  int y){
        return new Response(x, y, x-y);
    }

    @GetMapping("/div/{x}/{y}")
    public Response div(@PathVariable int x, @PathVariable  int y){
        return new Response(x, y, x/y);
    }

    @GetMapping("/mul/{x}/{y}")
    public Response mul(@PathVariable int x, @PathVariable  int y){
        return new Response(x, y, x*y);
    }


}
