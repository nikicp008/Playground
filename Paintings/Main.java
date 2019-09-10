#include<stdio.h>
int main()
{
    //fill your code
    int a,b,c,d,e,f,g,h,i,j,k;
    scanf("%d\n%d\n%d\n%d\n%d\n%d",&a,&b,&c,&d,&e,&f);
    g=a*b;
    h=c*d;
    i=e*f;
    k=h+i;
    if(g>=k)
    printf("Raj can fix both painting");
    else
    printf("Raj cannot fix both painting");
    
    return 0;
}