package Case.javapractices;

public class MultiDimentionalSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {34,88,15,9,486,299,140,100,350};
		 
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]<numbers[j])
				{
					int value= numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=value;
					
				}
			}
		}

			for (int x:numbers) {
			
				System.out.println(x);
			}
		}



	}


