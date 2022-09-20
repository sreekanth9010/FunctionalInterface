package in.ineuron.FunctionalInterface;

@FunctionalInterface
interface Computer1
{
	void show(int num);
}
public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Computer1 c = n -> System.out.println("In show method of implementation "+n);
				
					
					c.show(9);
	}

}
