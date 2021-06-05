#include <iostream>
#include <vector>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n;
  cin >> n;
  vector<int> v(n);
  for (int i=0; i<n; i++)
	cin >> v[i];

  int ans = 0;
  int cnt = 0;
  int pick = 0;

  for (int i=1; i<n; i++)
  {
	if (v[i] < v[pick]) {
	  cnt++;
	}
	else 
	{
	  if (ans < cnt) {
		ans = cnt;
	  }
	  pick = i;
	  cnt = 0;
	}
  }
  if (ans < cnt ) ans = cnt;

  cout << ans;

}
