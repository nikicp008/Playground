#include<stdio.h>
int main()
{
    //fill your code
    int a,b;
    scanf("%d\n%d",&a,&b);
    float c;
    switch(b)
 {
  case 1:
   c=0.8*a;
   printf("Chris father needs to pay Rs.%0.2f.",c);
   break;
  case 3:
   c=0.9*a;
   printf("\nChris father needs to pay Rs.%0.2f.",c);
   break;
  case 4:
   c=0.9*a;
   printf("\nChris father needs to pay Rs.%0.2f.",c);
   break;
  case 6:
   c=0.25*a;
   printf("\nChris father needs to pay Rs.%0.2f.",c);
   break;
  case 7:
   c=0.25*a;
   printf("\nChris father needs to pay Rs.%0.2f.",c);
   break;
  case 10:
   c=0.7*a;
   printf("\nChris father needs to pay Rs.%0.2f.",c);
   break;
  case 11:
   c=0.7*a;
   printf("\nChris father needs to pay Rs.%0.2f.",c);
   break;
  case 12:
   c=0.65*a;
   printf("\nChris father needs to pay Rs.%0.2f.",c);
   break;
  case 5:
   c=1.0*a;
   printf("Chris father needs to pay Rs.%0.2f.",c);
   break;
  default:
  printf("\nInvalid Month");
  break;
 }
  return 0;
}