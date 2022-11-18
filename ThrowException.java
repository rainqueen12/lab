package javac1;
import java.lang.Exception;
import java.util.Scanner;
public class ThrowException {//class
		public static void main (String args[]) {
			int x,y;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 number");
			x = sc.nextInt();
			y = sc.nextInt();
			try {
				if(x <= 0 || y <=0) {
			System.out.println ( "Exception occure");
				}else
					System.out.println(x * y);
			}
			catch(Exception e) {
				System.out.println(e);
				}}
			}
