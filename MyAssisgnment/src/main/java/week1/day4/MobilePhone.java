package week1.day4;

public class MobilePhone {
int ramSize=8;
boolean isCharged=true;
String brandName="oppo";
String modelName="Reno 7";
double mobilePrice= 2999;
short modelNumber=20202;
public static void main(String[] args) {
	MobilePhone m=new MobilePhone();
	System.out.println(m.ramSize);
	System.out.println(m.isCharged);
	System.out.println(m.brandName);
	System.out.println(m.modelName);
	System.out.println(m.mobilePrice);
	System.out.println(m.modelNumber);
}
}
