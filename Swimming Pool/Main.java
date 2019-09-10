#include<stdio.h>
int main()
{
int a,b,z;
scanf("%d\n%d",&a,&b);
z=a*a*a*1000;
if(z>=b)
printf("Can store");
else
printf("Cannot store");
    //fill the code
    return 0;
}