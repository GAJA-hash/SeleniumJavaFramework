package demo;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		demo1();


		//	try {
		//		demo();
		//	} catch (Exception e) {
		//		// TODO Auto-generated catch block
		//		e.printStackTrace();
		//	}
	}
	//public static void demo() throws Exception {
	//	 {
	//		System.out.println("Hello World....");
	//		throw new ArithmeticException("not valid operation");
	////		int i = 1/0;
	////		System.out.println("Completed");
	////	
	//}
	//}

	public static void demo1() {

		try {
			int i = 1/0;
			System.out.println(i);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause()); 
			e.printStackTrace();	}
	}
}

