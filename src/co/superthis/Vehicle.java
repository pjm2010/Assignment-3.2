package co.superthis;

public class Vehicle {
/*This class will help us know the difference between super keyword and this keyword *\
 * 
 */
	
	int speed=100;
	int durability;
	int cost;

	
	Vehicle(){
		System.out.println("Always drive safe");  //Default constructor that will be called by super keyword from the child claas
	}
	
	void regulation(){
		System.out.println("Should abide by govt pollution rules and regulation"); // Method described in the parent class that will be called from the child class using the super keyword
	}


}
