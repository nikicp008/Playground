import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    change(n);
    
  }
  public static void change(int m)
  {
    int i,j,fact,prime;
     for(i=1; i<m; i++)
    {
        fact=0;
        for(j=1; j<=m; j++)
        {
            if(i%j==0)
                fact++;
        }
        if(fact==2)
      System.out.println(i);
     }

  }
}