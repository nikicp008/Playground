#include<stdio.h>
int main()
{
    //Fill the code
    int m,n,o;
        scanf("%d\n%d\n%d",&m,&n,&o);
        int a,b;
        a=75*n;
        b=30*o;
		if(m>=(a+b))
		{
		   printf("Boat is stable");
		}
		   else
		   printf("Boat will drow");
		   
    return 0;
}