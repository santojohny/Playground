#include <iostream>
using namespace std;
int main()
{
int n,sum=0,temp,p,count,pro;
cin>>n;
temp=n;
count=0;
while(n>0)
{
n=n/10;
count++;
}
n=temp;
while(n>0)
{
p = n%10;
pro=1;
for(int i=1;i<=count;i++)
{pro = pro*p;}
sum = sum + pro ;
n = n/10;
}
if(temp == sum)
{
cout<<"Kindly proceed with encrypting\n";
}
else
{
cout<<"It is not an Armstrong number\n";
}
return 0;
}