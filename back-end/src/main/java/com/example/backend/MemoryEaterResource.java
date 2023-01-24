package com.example.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
	    public ResponseEntity<List<Double>> memoryEater() {
		 Random generator = new Random();
		 List<Double> list = new ArrayList<>();
	       for(int i = 1; i<1050; i++) {
	    	   for(int j = 1; j < 1050; j++) {
		    	   list.add(generator.nextDouble() * i * j);
	    	   }
	       }
	       return (ResponseEntity.ok(list));
	    }
}
