#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  int a,b,c,i,hcf=1;
std::cin>>a>>b>>c;
int sum=6;
int pro = a*b*c;
  //Evaluate the HCF 
 for(i=2;i<=pro;i++)
 {
  if(a%i==0 && b%i==0 && c%i==0)
  {
   hcf=i;
   break;
  }
 }
int gp=0,sp=0;
//finding position of the largest number
if(a>b && a>c)
gp=1;
else if(b>a && b>c)
gp=2;
else
gp=3;
//finding position of the smallest number
if(a<b && a<c)
sp=1;
else if(b<a && b<c)
sp=2;
else
sp=3;
int x=gp+sp;//adding the positon of largest and smallest number
int y=sum-x;//subustracting it from the positions total(1+2+3=6)
switch(y)
{
case 1:std::cout<<"The treasure is in box which has number "<<a<<
"\nThe code to open the box is "<<hcf;
break;
case 2:std::cout<<"The treasure is in box which has number "<<b<<
"\nThe code to open the box is "<<hcf;
break;
case 3:
std::cout<<"The treasure is in box which has number "<<c<<
"\nThe code to open the box is "<<hcf;
break;
}
return 0;
}
