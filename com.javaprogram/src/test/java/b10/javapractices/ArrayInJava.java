package Case.javapractices;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array declaration 
		String b[];
		
		//array declaration + object with initialization
		String b1[]=new String [5];
	
		//array declaration +  value initialization
		
		String x[]= {"Kapil","Vibha"," Shraddha","Akshay","Aarju"};
		
		//Storing element in array
		 b1[0]="Kapil";
		 b1[1]="Vibha";
		 b1[2]="Shraddha";
		 b1[3]="Akshay";
		 b1[4]="Aarju";
		 
		 
		 //how to access elements
		System.out.println(b1[2]);
		System.out.println(b1[0]);
		
		System.out.println("@@@@@@@@@@@@");
		// replace element
		b1[2]="Pratibha";
		b1[3]="Naman";
		
		System.out.println(b1[0]);
		System.out.println(b1[1]);
		System.out.println(b1[2]);
		System.out.println(b1[3]); 
		System.out.println(b1[4]);
		
		
		//Size of array
		System.out.println(b1.length);
		
		System.out.println("@@@@@@@@@@@@@@@");
		
		
		
		
			//by using for loop
		for(int i=0;i<b1.length;i++)
		{
			System.out.println(b1[i]);
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		
	for (String y:b1)
	{
		System.out.println(y);
	}

	}

}
