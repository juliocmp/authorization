package com.jcmpcode.authorization.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){

        return "Hola Mundo ... Creado en  2023-04-21  ... Hoy  es .... " + fechaHoy().toString();
    }

    public String fechaHoy() {
        String hoy ="";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        hoy = dtf.format(LocalDateTime.now());
        return hoy;

    }
}
