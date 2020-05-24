#include <iostream>
int main(){int con;
float cost;
scanf("%d",&con);if (con <=200 )
cost=0.5*con;else if (con>200 && con<=400)// if the unit is less than or equal to 400
cost = (0.65*con)+100;else if (con>400 && con<=600) //If the unit is less than or equal to600
cost=(0.80*con)+200;else
cost=(1.25*con)+425;
cost=int(cost);
printf("Rs.%0g",cost); // display value
return 0;}