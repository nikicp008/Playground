#include<math.h>
#include<stdio.h>

int main()
{
    //fill the code
    int a,b;
    float c;
    float z;
    scanf("%f\n%d\n%d",&c,&a,&b);
    z=c*a;
    if(z>=b)
    printf("Can reach");
    else
    printf("Cannot reach");
    return 0;
}