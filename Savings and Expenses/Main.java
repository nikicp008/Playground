#include<stdio.h>
int main()
{
    //fill your code
    int a,b,c,d,e,f,g,h,i;
    scanf("%d\n%d\n%d\n%d\n%d",&a,&b,&c,&d,&e);
    f=a-b-c-d-e;
    if (f>0 && f<a)
    printf("He can save the money");
    else if (f==a)
    printf("He can manage the expenses");
    else if (f<0)
    printf("He has to work hard");
    return 0;
}