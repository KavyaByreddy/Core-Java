package basicprograms;

public class Palindrome {

	public static void main(String[] args) {
		int r,temp,sum=0;
		int n=454;
		temp=n;
		while(n>0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum)
		System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	}

	}