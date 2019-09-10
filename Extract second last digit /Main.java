import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
      int a,b,c;
      a=num1%10;
      b=num1/10;
      c=b%10;
		System.out.println(c);
	}
		// Type your code her
}