#include<stdio.h>
#include<math.h>
int main()
{
    //fill the code
    int a,b,c,d,e,g;
    float h,f,i,j;
    scanf("%d\n%d\n%d\n%d",&a,&b,&c,&d);
    e=(a/6);
    g=round(e);
    printf("%d\n",g);
	e=(d/6);
	f=(d%6)*0.1;
    printf("%0.1f\n",e+f);
    h=c/(e+f);
    printf("%.1f\n",h);
    j=(float)b/g;
    printf("%.1f\n",j);
    if(h>=j)
    printf("Eligible to Win");
    else
    printf("Not Eligible to Win");
    return 0;
}