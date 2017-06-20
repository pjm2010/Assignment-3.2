package co.superthis;

/*This class is the child class of the parent class */
public class TwoWheelers extends Vehicle{

	int x;
	int y;
	
	TwoWheelers(){
		super();				//This will call the default constructor of the parent class 
		
		}
	
	
	TwoWheelers(int x){
		this();
		System.out.println("Checking whether this can call its own constructor"); //This will call its own constructor hence the example of this calling its own constructor
		
		
		}
		
		
		public TwoWheelers(int cost, int height, int speed) {
				cost=super.cost; 									//using of super class to assign the varaible with the value of the parent class
				
		}
		
		public TwoWheelers(int x,int y){
			this.x=x;	//this  used to define the value of the instance 
			this.y=y;
			
			System.out.println("The value of X i "+x);
			System.out.println("The value of Y is "+y);
		}
		


	/*The below example illustrate the use of this and super varaibles */
	public void display(){ 
		System.out.println("The maximum speed of the vehicle which are allowed to manufature is "+super.speed); //Example of the super keyword used to call the 
		System.out.println("The maximum speed of a two wheeler  is "+this.speed); //Example of this keyword used to call the variable of the same class
		}
	
	 void superbikeFeature(int cost,int speed){
		System.out.println(cost);
		System.out.println(speed);
		super.regulation(); //Calls the method of parent class
		
		}
	
	
	
}
