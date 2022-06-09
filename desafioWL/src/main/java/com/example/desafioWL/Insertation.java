package com.example.desafioWL;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.desafioWL.entities.Item;
import com.example.desafioWL.entities.User;
import com.example.desafioWL.repositories.ItemRepository;
import com.example.desafioWL.repositories.UserRepository;


@Component
@Transactional
public class Insertation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ItemRepository itemRepository;

	public void run(String... arg) throws Exception {
		
		Item i1 = new Item(null, "Café");
		Item i2 = new Item(null, "Torta");
		Item i3 = new Item(null, "Bolo");
		Item i4 = new Item(null, "Pão");
		Item i5 = new Item(null, "Leite");
		
		itemRepository.save(i1);
		itemRepository.save(i2);
		itemRepository.save(i3);
		itemRepository.save(i4);
		itemRepository.save(i5);
		
		User u1 = new User(null, "Tales", "45602476958", i1);
		User u2 = new User(null, "Isabelly", "78945515354", i2);
		User u3 = new User(null, "Julio", "82245448236", i3);
		User u4 = new User(null, "Paulinha", "81743438445", i4);
		User u5 = new User(null, "Roberto", "14696285865", i5);
		
		userRepository.save(u1);
		userRepository.save(u2);
		userRepository.save(u3);
		userRepository.save(u4);
		userRepository.save(u5);
		}
}
