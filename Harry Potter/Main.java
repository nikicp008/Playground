#include<stdio.h>
int main()
{
    int x,y,z;
    scanf("%d",&x);
    y=x/1000;
    z=x%10;
    printf("%d",y+z);
    return 0;
    
}