import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    change(base,exponent);
    
  }
  public static void change(int m,int n)
  {
    int power=1,i;
    while(n!=0)
    {
      power=power*m;
      n--;
    }
      System.out.println(power);

  }
}