package com.example.muumi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.muumi.model.KategoriaRepository;
import com.example.muumi.model.Kategoriat;
import com.example.muumi.model.MuumiRepository;
import com.example.muumi.model.User;
import com.example.muumi.model.UserRepository;

@SpringBootApplication
public class MuumiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuumiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository urepository, KategoriaRepository krepository){return(args) ->{
		User user1 = new User("user","$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6","USER");
		User user2 = new User("admin","$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C","ADMIN");
		urepository.save(user1);
		urepository.save(user2);
		krepository.save(new Kategoriat("Muki"));
		krepository.save(new Kategoriat("Lautanen"));
		krepository.save(new Kategoriat("Kulho"));
		mrepository.save(new Muumi("Mörkö", "https://iittala.scene7.com/is/image/iittala/?qlt=90&op_usm=1.2,1,0,0&src=is{iittala/arabia-moomin-bowl-15_cm-groke?size=3800,3800&wid=2000&hei=2000&scl=2.0}&extend=100,100,100,100"));
	};
	
}
}
