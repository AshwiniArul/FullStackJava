package labwork2;

public class reverseTwodArray {

	public static void main(String[] args) {
		int twoDArray[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=twoDArray.length-1; i>=0;i--) {
			for(int j=twoDArray.length-1;j>=0;j--)
			{
				System.out.print(twoDArray[i][j]+" ");
			}
		}

	}

}
