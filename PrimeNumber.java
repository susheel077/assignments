package week2;

public class PrimeNumber {
public static void main(String[] args) {
	int n=13;
	int i=1;
	boolean isPrime=true;
	if(n==0||n==1)
	{
		System.out.println("not Prime");
	}
	else {
		while (n%i==0) {
			isPrime=false;
			i++;
			break;
			
		}
		if(isPrime==true) {
			System.out.println("It is Prime Number");
		}
		else {
			System.out.println("It is not Prime Number");
		}
	}
}
}
