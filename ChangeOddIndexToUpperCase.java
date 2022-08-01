package week2;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		//converting given string to Uppercase
		String text="susheel";
		char[] charArray=text.toCharArray();
		String convertedStr="";
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0)
			{
				convertedStr=convertedStr+Character.toUpperCase(charArray[i]);
							}
			else {
				convertedStr=convertedStr+charArray[i];
				
			}
			System.out.println(convertedStr);
		}
	}

}
