package TestPractise;

class Loop{
	void DOwhileloop() {
		//Even odd Number 1 to 10
		int a;
		a=1;
		do 
		{
			if(a%2==0)
			{
				System.out.println("even number of a:"  + a);
			}
			if (a%2!=0) {
				System.out.println("Odd number of a:" +a);
			}
			a++;
		}
		while (a<=10); 
	}

	//Reverse order 10 to 1
	void reverseorder() {
		int b;
		b=10;
		do {
			System.out.println("Reverse value of b:" +b);

			b--;
		}
		while(b>=1);
	}

	void whileloop() {
		//Even- Odd number
		int a=1;
		while(a<=10) 
		{
			if(a%2 == 0)	
			{
				System.out.println("Even number :" +a);
			}
			if (a%2 !=0)
			{
				System.out.println("odd number :" +a);
			}
			a++;
		}
	}
	void Reverseorder()
	{
		//Reverse order 10 to 1
		int b=10;
		while (b>=1)
		{
			System.out.println("Reverse value:" +b);	
		 b--;
		}
        
	}
}
public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop lp= new Loop();
		lp.whileloop();
		lp.Reverseorder();

	}
}