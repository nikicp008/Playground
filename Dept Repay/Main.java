#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  float i,d,e,f;
  i=(float)(a*b*c)/100;
  d=a+i;
  e=(float)(i/100)*2;
  f=d-e;
  printf("%.2f\n%.2f\n%.2f\n%.2f",i,d,e,f);
}