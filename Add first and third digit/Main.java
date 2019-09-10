import java.util.Scanner;
class Main{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int n1,n2;
      n1=num;
      while(n1>=10)
      {
        n1=n1/10;
      }
      n2=num%10;
      
		int product = n2+n1;
		System.out.println(product);
	}
}