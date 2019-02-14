import java.util.Scanner;


public class MainClass {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a = sc.next();
		FunctionInterface fun = (String b)-> b.replace(""," ");
		System.out.println(fun.space(a));
	}
}
