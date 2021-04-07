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
  vector<long long> v(n);

  for (int i=0; i<n; i++) 
    cin >> v[i];

  sort(v.begin(), v.end());

  long long ans = v[n-1];
  for (int i=n-2; i>=0; i--)
  {
    long long weight = v[i] * (n-i);
    if (ans < weight) ans = weight;
  }

  cout << ans;
}

