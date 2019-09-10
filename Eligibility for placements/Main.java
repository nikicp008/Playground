#include<stdio.h>
int main()
{
char z[100];
float c;
int a,b;
scanf("%[^\n]s\n",z);
scanf("%d\n%f\n%d",&a,&c,&b);
printf("%s\n",z);
printf("%d\n",a);
if(b==0 && c>7.0 || b>0 && b<3 && c>=7.5)
printf("Eligible to attend placement");
else
printf("Not Eligible to attend placement");
    //fill the code
    return 0;
}