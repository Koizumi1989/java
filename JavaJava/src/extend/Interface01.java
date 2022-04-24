package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {

	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("080-3343-1635");
		
		System.out.println("maximum phone number" + MobilePhone.MAX_NUMBER_DIGITS + "digit");
		mobilePhone.call("080-3343-1635");
		Interface01.classTakePicture(mobilePhone);
	}
	
	public static void classTakePicture(Camera camera) {
		camera.takePicture();
	}
}
