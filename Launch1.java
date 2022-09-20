package in.ineuron.FunctionalInterface;

//using annotation we are embedding it as functional interface
//that means it should contain only one abstract method and remaining properties
//of interface remains same


@FunctionalInterface  
interface Demo  		
{						
	void disp();
	
}

//FunctionalInterface implementation using traditional apparoah (Normal class approach)
class Alpha implements Demo
{
	//overridng the disp method of interface 
	public void disp()
	{
		System.out.println("Í have give the body");
	}
}



public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Upcasting or looseCoupling  to achieve polymorphism
		Demo d = new Alpha();
		d.disp();
	}

}
