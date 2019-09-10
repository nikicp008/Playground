#include<stdio.h>
int main()
{
    int x,y;
    scanf("%d",&x);
    if(x%4==0 && x%100!=0 || x%100==0 && x%400==0)
    printf("%d is a leap year",x);
    else
    printf("%d is not a leap year",x);
    //fill the code
    return 0;
}