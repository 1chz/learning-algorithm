#include <iostream>

using namespace std;
int coin[4] = {25, 10, 5, 1};
int ans[4];
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int t;
  cin >> t;
  while(t--)
  {
	int n;
	cin >> n;

	for (int i=0; i<4; i++)
	{
	  ans[i] = n/coin[i];
	  n %= coin[i];
	}
	for (int i=0; i<4; i++)
	  cout << ans[i] << " ";
  }

}
