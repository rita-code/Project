package excel_Read;

import java.io.IOException;

public class Excel_INT {

	public static void main(String[] args) throws IOException {
	
String s= excel_call.getStringData1(1, 0);
System.out.println(s);

   String k= excel_call.getintData1(2,1);
   System.out.println(k);
	

}
}
