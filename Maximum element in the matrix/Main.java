#include <iostream>
using namespace std;
int main()
{
  int r,c,a[10][10],max=0;
  cin>>r>>c;
  for(int i = 0;i<r;i++){
    for(int j = 0;j<c;j++){
      cin>>a[i][j];
      if (a[i][j]>max)
        max = a[i][j];      
    }
  }
  cout<<"The maximum element is "<<max;
}
  
    