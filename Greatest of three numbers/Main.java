#include<stdio.h>
int main()
{
    //Fill the code
    int x,y,z;
    scanf("%d\n%d\n%d",&x,&y,&z);
    if(x>y&& x>z)
    {
    printf("%d is greater",x);
    }
    else if(z>y&& z>x)
    {
    printf("%d is greater",z);
    }
    else
    printf("%d is greater",y);
    return 0;
}