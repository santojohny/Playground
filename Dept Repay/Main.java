#include<iostream>
#include <iomanip>
#include <sstream>
void precise(float value)
{
   std::stringstream ss;
    ss << std::fixed << std::setprecision(2) << value;
    std::string str = ss.str();
    // Ensure that there is a decimal point somewhere (there should be)
    if(str.find('.') != std::string::npos)
    {
        // Remove trailing zeroes
        str = str.substr(0, str.find_last_not_of('0')+1);
        // If the decimal point is now the last character, remove that as well
        if(str.find('.') == str.size()-1)
        {
            str = str.substr(0, str.size()-1);
        }
    }
  std::cout << str << std::endl;
}
int main()
{
  float i,a,da,d;
  int p,r,y;
  std::cin>>p>>r>>y;
  i = (p*r*y)/100;
  a = p+i;
  d = i*(0.02);
  da = a-d;
  precise(i);
  precise(a);
  precise(d);
  precise(da);
  return 0;
}
