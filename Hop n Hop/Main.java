#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  float d;
  d = sqrt(((x-3)*(x-3))+((y-4)*(y-4)));
  cout<<int(d); 
}