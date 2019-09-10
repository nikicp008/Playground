#include<stdio.h>

int main()
{
    int a,b,c,d;
    int e=4;
    scanf("%d",&a);
    for(c=1;c<=a;c++)
    {
        if(c%2==0)
       {
           e=e-2;
        printf("%d ",e);
       }
        else
        {
        e=e+3;
        printf("%d ",e);
        }
        
    }
    return 0;
    }