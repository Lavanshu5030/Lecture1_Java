import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); // "s.nextLine" is used to print string contains space as well where as "s.next" do not print the string after spaces
		
		System.out.println(str);
		int p = s.nextInt();
		int r = s.nextInt();
		int t = s.nextInt();
		int si = (p * r * t)/100;
		System.out.println(si);
	}
	

}
