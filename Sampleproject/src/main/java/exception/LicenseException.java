package exception;

public class LicenseException {

	public static void main(String[] args) throws DrivingLicense {
		LicenseException obj=new LicenseException();
		obj.dL(16);
		

	}
	public void dL(int  age) throws DrivingLicense {
		if(age<18) {
	throw new DrivingLicense("NOT ELLIGIBLE");
	
	
		}
		else {
			System.out.println("ELLIGIBLE");
		}
	}

}
