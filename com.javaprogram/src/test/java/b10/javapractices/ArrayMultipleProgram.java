package Case.javapractices;

public class ArrayMultipleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int multi[][]= {{50,100,150,200,250},{20,70,45,55,95},{20,40,60,80,100},{30,60,90,120,150},{110,130,140,160,170}};
		System.out.println("row="+multi.length);
		System.out.println("colunm="+ multi[2].length);
		for(int i=0;i<multi.length;i++)
			{
			for(int j=0; j<multi[i].length; j++)
					{
					  System.out.print(multi[i][j]+"\t");
					}
					  System.out.println(); 
		}
	 
	}

}
 