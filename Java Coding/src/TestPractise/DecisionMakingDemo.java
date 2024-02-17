package TestPractise;
class Decisionmaking {
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
public class DecisionMakingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decisionmaking dm= new Decisionmaking();
		dm.Age(20,'F',"MH");
	}


}