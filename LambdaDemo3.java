package in.ineuron.FunctionalInterface;

interface laptop
{
	int add( int num1 , int num2);
}
public class LambdaDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			laptop l = (n1 , n2) ->  n1+n2;
			System.out.println(l.add(10, 20));
	}

}
