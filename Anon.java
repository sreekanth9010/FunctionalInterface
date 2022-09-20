package in.ineuron.FunctionalInterface;


@FunctionalInterface
interface Cls 
{
	int getLength(String s);
}
public class Anon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cls c = new Cls()
				{
					public int getLength(String k)
					{
						return k.length();
					}
				};
				System.out.println(c.getLength("sachin"));

}
}

