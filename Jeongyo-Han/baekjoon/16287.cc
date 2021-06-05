#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

int e[400001];

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int w, n;
  cin >> w >> n;

  vector<int> v(n);
  for (int i=0; i<n; i++) 
	cin >> v[i];

  for (int i=0; i<n; i++)
  {
	for (int j=i+1; j<n; j++)
	{
	  int sum = v[i] +v[j];
	  int val = w-sum;
	  if (val <= 0 || val > 4e5) continue;
	  if (e[val] && e[val] <i )
	  {
		cout << "YES";
		return 0;
	  }
	  if (e[sum] > j || e[sum] == 0) e[sum] = j;
	}
  }
  cout << "NO";
}
