package TestPractise;
class Statement {
	int b = 50, c= 70;
	void ifstatement() {
		if ( b==60 || c==70 ) {
			System.out.println("Value of b is 50 & c is 70 ");
		}
	}
	int i =50;
	void ifStatement() {
		if (i>40) {
			System.out.println("value of i is 50");
		}
	}
	int x= 10000;
	void ifelsestatement() {
		if(x < 80000) {
			System.out.println("You are eligible for loan 50000");
		}
		else {
			System.out.println("You are eligible for loan 75000");
		}
	}
	int y=150;
	void ifElseststement() {
		if(y>100) {
			System.out.println("Not eligible");

		}
		else {
			System.out.println("you are eligible for loan 100");
		}
	}
	void SwitchStatement() {
		int num=30;
		switch(num) {
		case 10: System.out.println(10);
		break;
		case 20:System.out.println(20);
		break;
		case 30:System.out.println(30 );
		break;
		default:System.out.println("Invalid value");

		}
	}
	
	
		//if else if
		void ifelseif(int a) 
		{
			if(a<10000)
			{
				System.out.println("Redmi Mobile");
			}
			else if (a<=20000)
			{
                System.out.println("Samsung");
			}


			else if (a<=30000)
			{
                System.out.println("Vivo");
			}
			else
			{
				System.out.println("Apple");
			}

		}
		void Age(int a,char G, String s)
		{
			if(a>18) 
			{
				if(G=='F') 
				{
					if (s=="MH") 
					{
						System.out.println("Belongs to MH");
					}	
			       System.out.println("Indian Women");
				}
			
				System.out.println("eligible for voting");
			}
			else 
			{
				System.out.println("not eligible for voting");
			}
		}

	}
	public class StatementsExample {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Statement st = new Statement();
			st.ifstatement();
			st.ifStatement();
			st.ifelsestatement();
			st.ifElseststement();
			st.SwitchStatement();
			st.ifelseif(10000);
			st.ifElseststement();
			st.Age(20,'F',"MH");
		}

	}
