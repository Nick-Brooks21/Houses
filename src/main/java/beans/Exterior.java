package beans;

import javax.persistence.Embeddable;

@Embeddable
public class Exterior {
	private int stories;
	private String color;
	private Boolean garage;
	
	public Exterior() {
		super();
	}
	
	public Exterior(int stories) {
		this.stories = stories;
	}
	
	public Exterior(int stories, String color) {
		this.stories = stories;
		this.color = color;
	}
	
	public Exterior(int stories, String color, Boolean garage) {
		this.stories = stories;
		this.color = color;
		this.garage = garage;
	}
	
	@Override
	public String toString() {
		return "Exterior [stories= " + stories + ", color= " + color + ", garage= " + 
				garage + "]";
	}
	
	public int getStories() {
		return stories;
	}
	public void setStories(int stories) {
		this.stories = stories;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getGarage() {
		return garage;
	}
	public void setGarage(Boolean garage) {
		this.garage = garage;
	}

}
