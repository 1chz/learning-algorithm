#include <iostream>
#include <string>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int ans =0;

  string s;
  cin >>s;
  for (int i=0; i<s.size(); i++)
  {
	ans*=16;
	char c = s[i];
	if (c>='A' && c<= 'F')
	{
	  ans += (c-'A')+10;
	}
	else ans += (c-'0');
  }
  cout << ans;
}
