#include<stdio.h>
int main()
{
    //fill the code
    int a,b,c,d,e,f,g,h,i;
    scanf("%d\n%d\n%d",&a,&b,&c);
    e=a*b;
    f=e-a;
    h=e-(2*a);
    g=e-b;
    i=e-(2*b);
    if(c>b && c<=2*b || c<=g && c>i)
    printf("It is a mango tree");
 
    else
    printf("It is not a mango tree");
    
    
    return 0;
}