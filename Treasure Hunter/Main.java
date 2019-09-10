#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c,d,e,f;
  scanf("%d%d%d",&a,&b,&c);
  d=a*b/100;
  a=a-d;
  e=a*c/100;
  a=a-e;
  printf("%d\n%d\n%d",d,e,a/3);
}