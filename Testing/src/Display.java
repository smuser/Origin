
public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display test = new Display();
		test.display();
	}
	public void display()
	{
		String[] test = {"test","ing"};
		System.out.println("New update from display");
		for(String c: test)
		{
			System.out.println(c);
			System.out.println("Test");
		}
	}

}
