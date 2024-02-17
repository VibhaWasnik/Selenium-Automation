package TestPractise;
class calculatorExample {
 int a =10, b =20,c;
 void Addition() {
	 c = a + b;
	 System.out.println("Addition is :" + c);	 
 }
 
 void Substraction()
 {
	 c = a - b;
	 System.out.println("Substraction is :" +c);
 }
 
 void Multiplication ()
 {
	 c = a*b;
	 System.out.println("Multiplication is :"  +c);
 }
	
 void Division ()
 {
	 c =a/b;
	 System.out.println("Division is :" + c);
 }
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculatorExample cal = new calculatorExample();
		cal.Addition();
		cal.Substraction();
		cal.Multiplication();
		cal.Division();
		}

	
}