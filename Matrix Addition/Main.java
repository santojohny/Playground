#include<iostream>
using namespace std;
int main()
{
int r,c;
int a[10][10];
int b[10][10];
 int s[10][10] = {0};
cin>>r>>c;
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
cin>>a[i][j];
}
}
  for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
cin>>b[i][j];
}
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
s[i][j] = a[i][j] + b[i][j];
cout<<s[i][j]<<" ";
}
cout<<"\n";
}
}