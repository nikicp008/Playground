#include<stdio.h>
int main()
{
 int n,i,k;
 scanf("%d",&n);
 i=n*n;
 k=i%10;
 if(n/10!=0)
 {
 printf("Invalid Input");
 }
 else 
 {
     if(n==k)
 {
     printf("Automorphic Number");
 }
 else
 {
 printf("Not Automorphic Number");
 }
}
 
 
 
    //Fill the code
    return 0;
}