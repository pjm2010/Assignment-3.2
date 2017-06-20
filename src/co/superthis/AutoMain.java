package co.superthis;

public class AutoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheelers two=new TwoWheelers();
		two.display();
		two.superbikeFeature(340000, 90);
		
		TwoWheelers t=new TwoWheelers(10);//This calls the constructor which had this to call its own current constructor
		TwoWheelers bicycle=new TwoWheelers(1000,30,40);
		TwoWheelers  shot= new TwoWheelers(1,4);
				
		
		
	}

}
