#include<stdio.h>
#include<math.h>
int main()
{
    //fill the code
    int x1;
    double y1;
    scanf("%d\n%lf",&x1,&y1);
    float wcf;
    wcf=35.74 + (0.6215*x1) + ((0.4275*x1) - 35.75) * pow(y1,0.16);
    printf("%.2f",wcf);
    return 0;
}