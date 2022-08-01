package week2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr= {41,21,31,41,50,60,7,8,9,8,7,60,0,};
		System.out.println("Duplicate numbers are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]+"");
					
				}
				
			}
		}
	}

}
