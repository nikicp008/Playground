#include<stdio.h>
int main()
{
  //f
  int a,b,c,d,e,f;
  scanf("%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f);
  printf("%.1f\n%.1f",(float)(a+c+e)/3,(float)(b+d+f)/3);
}