package com.example.JPA.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA.Model.pharMod;
import com.example.JPA.Repository.pharRepo;
@Service
public class pharserv {
	
	
    @Autowired
	pharRepo phre;
    public List<pharMod> main(){
    	return phre.findAll();
    }
    public pharMod sub (pharMod ph) {
    	return phre.save(ph);
    }
    public pharMod dub(pharMod ph) {
    	return phre.save(ph);
    }
    public void del(int cost)
    {
        phre.deleteById(cost);
    }
}