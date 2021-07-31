package labwork2;

public class primeOrNot 
{

	public static void main(String[] args) 
	{
        int number = 11;
        int count = 0;
        for(int i = number;i>0;i--)
        {
        	if(number%i==0)
        	{
        		count+=1;
        	}
        	
        }
        if(count<=2)
        {
        	System.out.println(number);
        }
	}

}
