import java.util.Scanner;
class Main{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
      int n1;
      n1=num1;
      while(n1>=10)
      {
        n1=n1/10;
      }
		System.out.println(n1);
    }
	}