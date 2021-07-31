package labwork2;

public class twoDLargestNum {

	public static void main(String[] args) {
		int twodArray[][]= {{11,23,38},{35,12,3},{5,15,56}};
		int largeNum=0;
		for(int i =0; i<twodArray.length;i++)
		{
			for(int j=0;j<twodArray.length;j++)
			{
				if (largeNum <twodArray[i][j])
				{
					largeNum=twodArray[i][j];
				}
			}
			
		}
		System.out.println("The Largest Number Of two dimensional Array is "+largeNum);
	}

}
