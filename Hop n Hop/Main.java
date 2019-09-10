#include<stdio.h>
#include<math.h>
int main()
{
    //fill the code
    int x,y,x1,y1;
    x=3;
    y=4;
    scanf("%d\n%d",&x1,&y1);
    int d;
    d=sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
    printf("%d",d);
    return 0;
}