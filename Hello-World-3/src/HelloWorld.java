import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HelloWorld {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar date = Calendar.getInstance();
		
		System.out.println("Hello World! The current date is " + sdf.format(date.getTime()));
		System.out.println("Hello, Alice!");
		System.out.println("Hello, Bob!");
		System.out.println("Hello, Charlie...");
		System.out.println("...HeLlO dEnIsE...");
	}

}
