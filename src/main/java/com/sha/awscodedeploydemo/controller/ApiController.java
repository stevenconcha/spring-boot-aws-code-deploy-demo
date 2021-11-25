package com.sha.awscodedeploydemo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author Steven Parra
 *
 */
@RestController
public class ApiController {

    @GetMapping("api/health")
    public ResponseEntity<?> healtCheck(){
        return ResponseEntity.ok("Funciona Correctamente");
    }

}
