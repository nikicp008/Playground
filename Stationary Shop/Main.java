#include<stdio.h>
int main()
{
    //fill your code
    int a,b,d;
    char c[100];
    scanf("%s",c);
    
    scanf("%d%d%d",&a,&b,&d);
    
    if(a==0)
    printf("Out of stock");
        
         else if(d<a)
         { 
        printf("Amount for %d %s is %d\n",d,c,b*d);
        printf("Remaining number of pencil present in stock is %d",a-d);
            
        }
        else if (d>a)
        {
        printf("Only %d scale are available",d-a);
        }
        else
        printf("Out of stock");
}