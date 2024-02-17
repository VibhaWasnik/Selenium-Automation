package TestPractise;
class CalculatorType{
	int a= 25, b= 20,c;
	
	// without Return without Argument
	
	void Addition() {
	c = a+b;
	System.out.println("Addition:"+ c);
}
	
	// without Return with Argument
	void Substraction(int a, int b) {
		c = a-b;
		System.out.println("Substraction: " + c);
	}

	// with Return without Argument
	
	int Multiplication() {
	c= a*b;
       return c;
	}
	
    // with Return with Argument
	int Division (int a, int b) {
	     c= a/b;
		return c;
	 }
	}
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CalculatorType Test= new CalculatorType();
       Test.Addition();
       Test.Substraction(25, 20);
       int Multiplication =Test.Multiplication();
       int Division= Test.Division(25, 20);
       System.out.println("Multiplication:" + Multiplication);
	   System.out.println("Division:"+Division);
	}

} 