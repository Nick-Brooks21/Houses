package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numOfRooms;
	private int width;
	private int length;
	@Autowired
	private Exterior exterior;

	public Room() {
		super();
		this.numOfRooms = 3;
	}
	
	public Room(int numOfRooms) {
		super();
		this.numOfRooms = numOfRooms;
	}
	
	public Room(int numOfRooms, int width, int length) {
		super();
		this.numOfRooms = numOfRooms;
		this.length = length;
		this.width = width;
	}
	
	public int getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public Exterior getExterior() {
		return exterior;
	}

	public void setExterior(Exterior exterior) {
		this.exterior = exterior;
	}

	@Override
		public String toString() {
			return "Rooms [numOfRooms= " + numOfRooms + ", length= " + length + 
					"ft, width= " + width + "ft]";
	}

}
