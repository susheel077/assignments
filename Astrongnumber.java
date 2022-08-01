package week2;

public class Astrongnumber {
	public static void main(String[] args) {
		int number=150;
		int sum=0;
		int remainder;
		int temp;
		temp=number;
		while (number>0) {
			remainder=number%10;
			sum=sum+(remainder*remainder*remainder);
			number=number/10;
		}
		if (temp==sum) {
			System.out.println("It is Armstrongnumber");
		}
		else {
			System.out.println("It is not Armstrongnumber");
			
		}
			
		}
	}


