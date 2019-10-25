package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Room;
import beans.Exterior;
import controller.BeanConfiguration;
import repository.RoomRepository;

@SpringBootApplication
public class HousesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HousesApplication.class, args);
		}
	
		@Autowired
		RoomRepository repo;
		
		@Override
		public void run (String... args) throws Exception { 
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Room r = appContext.getBean("room", Room.class);
		repo.save(r);
		
		Room t = new Room(4, 15, 12);
		Exterior e = appContext.getBean("exterior", Exterior.class);
		t.setExterior(e);
		repo.save(t);
		
		List<Room> allRooms = repo.findAll();
		for(Room rooms: allRooms) {
			System.out.println(rooms.toString());
		}
		
	}

}
