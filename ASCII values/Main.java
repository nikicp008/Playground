#include<stdio.h>
int main()
{
char ch;
scanf("%c",&ch);
    //fill the code
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
       ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
       printf("ASCII of %c is %d",ch,ch);
       else
       printf("Not a vowel");
    return 0;
}