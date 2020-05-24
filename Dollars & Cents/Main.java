#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,ten=0;
  cin>>a>>b>>c>>d;
  int fullcent = b+d;
  if (fullcent>100){
    ten = fullcent/100;
  }
  int dollar = a+c+ten;
  int cent = fullcent - ten*100;
  cout<<dollar<<endl<<cent;
return 0;
}