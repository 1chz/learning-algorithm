#include <iostream>
#include <string>
#include <vector>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n, m;
  cin >> n >> m;
  int k;
  cin >> k;
  vector<int> v;

  while (k--)
  {
	int tmp;
	cin >> tmp;
	v.push_back(tmp);
  }

  int cur = 1;
  int ans = 0;
  for (int i=0; i<v.size(); i++)
  {
	if ( cur <= v[i] && v[i] <= cur+(m-1) );
	else if ( cur < v[i] )
	{
	  int tmp = (v[i] - cur - (m-1));
	  ans += tmp;
	  cur += tmp;
	}
	else if (cur > v[i] )
	{
	  int tmp = (cur- v[i]);
	  ans += tmp;
	  cur -= tmp;
	}
  }
  cout << ans;
}
