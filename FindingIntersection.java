package week2;

public class FindingIntersection {

	int myArray[]= {3,2,11,4,6,7};
	int myArray1[]= {1,2,8,4,9,7};
	{
		for (int i = 0; i < myArray.length; i++) {
			
		for (int j = 0; j < myArray1.length; j++) {
			if(myArray[i]==myArray1[j]) {
				System.out.print(myArray1[j]);
			}
			
		}
		}
	}
}
