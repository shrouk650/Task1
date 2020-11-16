import java.util.Scanner;

public class Question3 {

	public static void User_data(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String Input_name = sc.next();
		System.out.println("Please enter your age");
		String Input_age= sc.next();
		System.out.println("Please enter your Email");
		String Input_Email= sc.next();
		System.out.println("Please enter your Faculty");
		String Input_Faculty= sc.next();
		System.out.println("Your name is "+Input_name);
		System.out.println("Your age is "+Input_age);
		System.out.println("Your Email is "+Input_Email);
		System.out.println("Your Faculty is "+Input_Faculty);
	}
	
public static void main(String[] args) {
		
	User_data();
		

	}
}
