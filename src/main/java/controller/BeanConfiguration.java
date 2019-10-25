package controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Room;
import beans.Exterior;

@Configuration
public class BeanConfiguration {

	@Bean
	public Room room() {
		Room bean = new Room();
		bean.setNumOfRooms(3);
		bean.setLength(12);
		bean.setWidth(10);
		return bean;
	}
	
	@Bean
	public Exterior exterior() {
		Exterior bean = new Exterior(1, "Navy Blue", true);
		return bean;
	}
}
