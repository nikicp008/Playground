#include<stdio.h>
#include<math.h>
int main()
{
 int a;
 double b,c,d,e;
 scanf("%d",&a);
 b=a*0.5;
 c=ceil(100+(a*0.65));
 d=ceil(200+(a*0.80));
 e=floor(425+(a*1.25));
 if(a<=200)
 printf("Rs.%0.0f",b);
 else if(a<=400 && a>=200)
 printf("Rs.%0.0f",c);
 else if(a<=600 && a>=400)
 printf("Rs.%0.0f",d);
 else if(a>=600)
 printf("Rs.%0.0f",e);
 //fill the code
    return 0;
}