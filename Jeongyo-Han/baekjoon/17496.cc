#include <iostream>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n, t, c, p;
  cin >> n >> t >> c >> p;

  int day = 1;
  int ans = 0;
  while ( day + t <= n )
  {
	day += t;
	ans += c*p;
  }
  cout << ans;
}
