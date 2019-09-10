#include<stdio.h>
int main()
{
    //Fill the code
    char c;
    scanf("%c",&c);
    if(65 <=c && c<=90)
	   printf("Upper");
    else if(97<=c && c<=122)
    printf("Lower");
    else if(48<=c && c<=57)
    printf("Number");
    else
    printf("Symbol");
    
    return 0;
}