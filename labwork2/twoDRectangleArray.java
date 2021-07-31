package labwork2;

public class twoDRectangleArray {

	public static void main(String[] args) 
	{
		int twodArray[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i =0; i<twodArray.length;i++)
		{
			for(int j=0;j<twodArray.length;j++)
			{
				System.out.print(twodArray[i][j]+"     ");
			}
			System.out.println();
		}
	}

}
