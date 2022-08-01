package week2;

public class ReverseEvenWord {
	public static void main(String[] args) {
		String text="He is Working";
		String[] split=text.split(" ");
		String convertedtext="";
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0)
			{
		char[] charArray=split[i].toCharArray();
		String rev="";
		for (int j = charArray.length-1; j >=0; j--) {
			rev=rev+charArray[j];
		}
		convertedtext=convertedtext+" "+rev;
			}
			else
			{
				convertedtext=convertedtext+" "+split[i];
			
		}
			System.out.println(convertedtext);
		
			}
			
		}
	}

