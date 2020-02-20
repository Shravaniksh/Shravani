
public class OddSum {

	public static void main(String[] args) 
	{
		int number=8, i, oddSum = 0;
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; 
			}
		}
		System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
	}
}