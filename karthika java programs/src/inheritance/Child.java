package inheritance;

public class Child extends Parent{
	public void print()
	{
		//display();
		System.out.println("Welcome home");
	}
public static void main(String[]args) {
	Child obj=new Child();
			obj.print();
			obj.display();
}
}
