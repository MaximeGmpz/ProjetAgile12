package lesCases;
import java.util.Scanner;

public class MonScanner {

	public char c;
	
	public MonScanner(){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		c = str.charAt(0);
	}
	
}