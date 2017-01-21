
import java.util.Scanner;

public class prime_cnt
{

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int value=scan.nextInt();
		int tot_prime=0,cnt=0,i=0,j=0;
		for(i=value;i>=2;i--)
		{
			for(j=2;j<=i;j++)
			{
				if((i%j)==0)
					cnt++;
			}
			if(cnt==1)
				tot_prime++;
			cnt=0;
		}
		
		System.out.print(tot_prime);
		
	}

}
