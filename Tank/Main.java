#include<stdio.h>
int main()
{
    //fill your code
    float x,y,z,a,b,c,d;
    scanf("%f\n%f\n%f\n%f",&a,&b,&c,&d);
    x=(float)3.14*a*a*b;
    y=(float)c*d;
    if(x<=y)
    printf("The tank can be filled within %0.1f hours",d);
    else
    printf("The tank cannot be filled within %.1f hours",d);
    
    return 0;
}