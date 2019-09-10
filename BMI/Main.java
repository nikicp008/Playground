#include<stdio.h>
int main()
{
    //fill your code
    float a,b,z,x,y;
    scanf("%f\n%f",&a,&b);
    x=(float)b/100;
    y=x*x;
    z=(float)a/y;
    if(z<18.5)
    printf("You are underweight. Have an apple daily.");
    else if(z>=18.5 && z<=24.9)
    printf("You are normal. Go walking daily and maintain it.");
    else if(z>=25 && z<=29.9)
    printf("You are overweight. Go to Gym daily.");
    else
    printf("You are obese. Go to doctor");
    return 0;
}