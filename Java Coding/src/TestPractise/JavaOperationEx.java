package TestPractise;
class JavaOperation{
	int b=20;
   void prefixDecrement() {
		System.out.println("Prefix Decrement  value of b:" + --b);
	}
   void PostfixDecrement() {
	   System.out.println("Postfix Decrement value of b:" + b--);
	   System.out.println("Update value of b: "  + b);
   }
   
   void AssignmentOperator() {
	   int i=100;
	   i+=100 ;//i=i+100
			   System.out.println("Result of += :" + i);
	   
			   
   }
}



public class JavaOperationEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaOperation Test = new JavaOperation();
		  Test.prefixDecrement();
		  Test.PostfixDecrement();
		  Test.AssignmentOperator();
		  
	}

}
