package in.ineuron.FunctionalInterface;

@FunctionalInterface
interface Telusko
{
	void beta();
}
public class AnnomousInner {

	public static void main(String[] args) {
		// Anonymous inner object
		Telusko t = new Telusko()
				{
			public void beta()
			{
				System.out.println("Implementation using anonomous inner object");
			}
				};
				t.beta();
	}

}
