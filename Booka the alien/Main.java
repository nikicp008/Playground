#include<stdio.h>
int main()
{
  //fill your code
  int a;
  scanf("%d",&a);
  int b,c,d;
  b=a/365;
  c=(a-(b*365))/7;
  d=c%7;
  printf("%d\n%d\n%d",b,c,d);
}