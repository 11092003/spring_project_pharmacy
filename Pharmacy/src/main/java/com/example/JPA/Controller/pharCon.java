package com.example.JPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.Model.pharMod;
import com.example.JPA.Service.pharserv;

@RestController
public class pharCon {
  
	@Autowired
	
	pharserv servi;
	@GetMapping("/login")
	public List<pharMod> main(){
		return servi.main();
	}
	@PostMapping("/signin")
	public pharMod sub(@RequestBody pharMod ph) {
		return servi.sub(ph);
	}
	@PutMapping("/signup/{id}")
	public pharMod dub(@RequestBody pharMod ph) {
		return servi.dub(ph);
	}
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable("id") int cost) {
		servi.del(cost);
	}
	
 
}
