import java.util.*;

public class HelloWorld {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println(3+6);
		System.out.println("Second Commit");
		System.out.println("Third commit");
		System.out.println("So far fourth commit");
		sc = new Scanner(System.in);
		System.out.println("Enter a name : ");
		String name = sc.next();
		System.out.printf("Hello %s", name);
	}

}
