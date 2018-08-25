interface Vehicle{
	//all are abstract methods
	 void changeGear(int a);
	 void speedUp(int a);
	 void applyBrakes(int a);
}

class Bike implements Vehicle{
	int speed;
	int gear;
	//defining methods :  
	public void changeGear(int newGear) {
		gear = newGear;
	}
	
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}
	
	public void show() {
		System.out.println("Speed : " + speed + "  Gear : " + gear);
	}
}
public interface interface_ex1 {
	public static void main(String[] args) {
		
		//creating instance of Bike
		Bike bike = new Bike();
		bike.changeGear(3);
		bike.speedUp(5);
		bike.applyBrakes(2);
		System.out.println("Bike States : ");
		bike.show();
	}
}
