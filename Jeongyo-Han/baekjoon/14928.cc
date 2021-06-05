#include <iostream>
#include <string>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  string s;
  cin >> s;

  int ans = 0;
  for (int i=0; i<s.size(); i++)
  {
	int n = s[i]-'0';
	ans = (ans*10+n)%20000303;
  }
  cout << ans;
}
