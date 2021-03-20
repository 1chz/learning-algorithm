#include <iostream>

using namespace std;

int main()
{
  int m,s;
  m =s=0;
  for (int i=0; i<4; i++)
  {
	int tmp;
	cin >> tmp;
	s+=tmp;
  }
  m = s/60;
  s%=60;
  cout << m <<"\n" << s;
}
