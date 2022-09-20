package in.ineuron.FunctionalInterface;

@FunctionalInterface
interface Computer
{
	void show();
}
public class LambdaDemo {

	public static void main(String[] args) {
		// () == method signature , 	-> == Lambda Expression
		Computer comp = () -> System.out.println("Implementing the show method using Lambda");
					
				comp.show();

	}

}
