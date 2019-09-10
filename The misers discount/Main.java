#include<stdio.h>
int main()
{
  //fill your code
  float a,b,c;
  scanf("%f%f%f",&a,&b,&c);
  printf("%.2f\n%.2f\n%.2f",a+b,a+b-((c/100)*(a+b)),(c/100)*(a+b));
}