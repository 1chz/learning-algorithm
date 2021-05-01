#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  string str;
  cin >> str;

  int ans = 0;
  int stat = 1;
  int cur = 0;

  for (int i=0; i<str.size(); i++)
  {
	char c = str[i];
	if ('0' <=c && c <='9')
	{
	  cur *= 10;
	  cur += (c-'0');
	}
	else 
	{
	  ans = ans + (stat)*cur;
	  cur = 0;

	  if (c=='-')
		stat = -1;
	}
  }
  ans = ans + (stat)*cur;
  cout << ans;
}
