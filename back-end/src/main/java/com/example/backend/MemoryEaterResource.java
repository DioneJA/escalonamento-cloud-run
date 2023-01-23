package com.example.backend;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping(value="/teste")
@Resource
public class MemoryEaterResource {
	 @GetMapping
	    public ResponseEntity<List<Integer>> findAll() {
		 System.out.println("Entrou aqui");
		 List<Integer> list = new ArrayList<>();
	       for(int i = 0; i<1000; i++) {
	    	   for(int j = 0; j < 1000; j++) {
		    	   list.add(Math.round(i + j));
	    	   }
	       }
	       return (ResponseEntity.ok(list));
	    }
}
