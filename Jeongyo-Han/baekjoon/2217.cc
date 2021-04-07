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

  int n;
  cin >> n;
  vector<int> v(n);

  for (int i=0; i<n; i++) 
	cin >> v[i];

  sort(v.begin(), v.end());

  int ans = v[n-1];
  for (int i=n-2; i>=0; i--)
  {
	int weight = v[i] * (n-i);
	if (ans < weight) ans = weight;
	break;
  }

  cout << ans;
}
