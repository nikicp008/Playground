#include<stdio.h>
#include<math.h>
int main()
{
    //fill your code
    int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,x,y,z;
    scanf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d",&a,&b,&c,&d,&e,&f,&g,&h,&i);
    j=(a*b)/100;
    k=(a-j)+c;
    printf("In Flipkart: Rs.%d\n",k);
    l=(d*e/100);
    m=(d-l)+f;
    printf("In Snapdeal: Rs.%d\n",m);
    n=(g*h/100);
    o=(g-n)+i;
    printf("In Amazon: Rs.%d\n",o);
    if(k<m && k<o)
    printf("He will prefer Flipkart");
    
    else if(m<k && m<o)
    printf("He will prefer Snapdeal");
    else
    printf("He will prefer Amazon");
    return 0;
}