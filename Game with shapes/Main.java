#include<stdio.h>
int main()
{
int a,b;
  scanf("%d%d",&a,&b);
  int c,d;
  d=2*a;
  if(d<=b)
    printf("circle can be inside a square");
  else
    printf("circle cannot be inside a Square");
}