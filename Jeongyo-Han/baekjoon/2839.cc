#include <iostream>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n;
  cin >> n;

  int mx3 = n/3;
  mx3++;

  int ans = 1e9;
  for (int i=0; i<=mx3; i++)
  {
	int remain = n -3*i;
	if (remain%5 == 0)
	  ans = min(remain/5 + i, ans);
  }
  if (ans == 1e9)
	ans =-1;
  cout << ans;
}
