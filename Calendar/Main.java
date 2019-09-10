#include <stdio.h>

int main()
{
	int month;
	int year,days;
	scanf("%d\n%d",&month,&year);
	
	switch(month)
	{
		case  4:
		case  6:
		case  9:
		case 11:
			days=30;
			break;
		case  1:
		case  3:
		case  5:
		case  7:
		case  8:
		case 10:
		case 12:
			days=31;
			break;
			
		case 2:
			if (year%4==0 && year%100!=0 || year%400==0 && year%100==0)
			{
			    days=29;
			}
			else
			days =28;
			break;
		
		default:
			days=0;
			break;		
	}
	
	if(days)
		printf("Number of days is %d\n",days);

	
	return 0;
	
}