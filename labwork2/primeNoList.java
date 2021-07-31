package labwork2;

public class primeNoList {

	public static void main(String[] args) {
	
		for(int i=1;i<=100;i++)
		{
			int count =0;
			for(int j=i;j>0;j--)
			{
				if(i%j==0)
				{
					count+=1;
				}
			}
			if(count<=2)
			{
				System.out.println(i);
			}
		}

	}

}
