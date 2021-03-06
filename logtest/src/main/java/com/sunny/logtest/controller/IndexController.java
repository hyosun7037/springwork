package com.sunny.logtest.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.logtest.model.User;

@RestController
public class IndexController {

   @GetMapping({"","/"})
   public String Index() {
      return "<h1>IndexPage</h1>";
   }
   
   @PostMapping("/user")
   public ResponseEntity<?> user(@Valid @RequestBody User user, BindingResult bindingResult) {      
      return new ResponseEntity<User>(user, HttpStatus.CREATED);
   }
}