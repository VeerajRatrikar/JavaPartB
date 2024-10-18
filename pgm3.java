package veeraj;
/*Write a program that demonstrates handling of exceptions in inheritance. Create a base class called"Father"
and derived class called "Son" which extends the base class. In Father class , implement a constructor which takes 
the age and throws the exception Wrong Age() i.e. when the input age is equal to father's age. */
import java.util.Scanner;
class Father {
	int Fage;
	Scanner input = new Scanner(System.in);
	Father(){
		System.out.println("Enter Father's age:");
		Fage=input.nextInt();
	}
}

class Son extends Father{
	int Sage;
	Scanner input = new Scanner(System.in);
	Son(){
		//super;
		System.out.println("Enter son's age");
		Sage=input.nextInt();
	}
}

class WrongAgeException extends Exception
{
	public WrongAgeException(String str) {
		System.out.println(str);
	}
}

public class pgm3 {

	public static void main(String[] args) throws WrongAgeException{
		Son s = new Son();
		try {
			if(s.Sage>=s.Fage)
				throw new WrongAgeException("Exception");
			else
				System.out.println("You have entered a Valid Age");
		}
		catch(WrongAgeException ae)
		{
			System.out.println(ae + "SON'S AGE >= FATHERS'S AGE");
			
		}
	
	}
}
