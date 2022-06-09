import java.util.Scanner;
public class FahrenhiteToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int f = s.nextInt();
		//int cel = (5/9)*(f-32);
		//int cel = (5*(f-32))/9; do not give write result always
		int cel = (int)((5.0/9)*(f-32)); //Explicitly typecasted because 5.0 is a double and it needs 8 byte therefore we need to forcely convert it into int using explicitly type casting. 
		System.out.println(cel);  //   double/int gives double.
		
		// Arithmetic Operators
		System.out.println(5 / 9);
		System.out.println(5.0/9);
		System.out.println(9 - 5);
		System.out.println(9 * 5);
		System.out.println(9 + 5);
		System.out.println(9 % 5);
		char c = 'a';
		char i = (char)(c+3);
		System.out.println(i);
	}

}
