package edu.cjc.main.serviceImpl;



import java.util.Random;

import org.springframework.stereotype.Service;

import edu.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	Random rmd=new Random();
	int random=rmd.nextInt(100);
	
	
	

@Override
public String numberchecks(int gn) {
	
	
	if(random==gn) {
		return "Awesome You guess correct Number";
	}
	else if(random>gn) {
		return "Your guess is very loo,try again";
	}else {
		return "Your guess is very high,try again";
	}		
				
}





}
