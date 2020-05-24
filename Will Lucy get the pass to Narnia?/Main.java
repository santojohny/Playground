# include <iostream>
using namespace std;
int main()
{
  int num1, num2,menu;
  cout<<"Enter first number :";
  cin>>num1;
  cout<<" Enter second number :";
  cin>>num2;
  cout<<" Menu";
  cin>>menu;
  cout<<"\n1.Addition";
  cout<<"\n2.Subtraction";
  cout<<"\n3.Multiplication";
  cout<<"\n4.Division";
  cout<<"\n5.Remainder\n";
  switch(menu)
  {
    case 1:cout << num1+num2;break;
    case 2:cout << num1-num2;break;
    case 3:cout << num1*num2;break;
    case 4:cout << num1/num2;break;
    case 5:cout << num1%num2;break;
    default:cout <<"Invalid operation";break;
  }
  return 0;
}