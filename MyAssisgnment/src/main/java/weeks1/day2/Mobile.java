package weeks1.day2;

public class Mobile {
	public void sendMessage() {
	System.out.println("sendMessage");
}
	public void shareDocument() {
		System.out.println("shareDocument");
	}
	public void call( ) {
		System.out.println("call");
	}
	public static void main(String[] args) {
		Mobile MyMobile=new Mobile();
				MyMobile.sendMessage();
		MyMobile.shareDocument();
		MyMobile.call();
		
	}
}
