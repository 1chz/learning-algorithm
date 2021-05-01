#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

struct User{
  int a,b;
  User(int a, int b):a(a), b(b) {};
  bool operator<(const User& o) const 
  {
	return a < o.a;
  }
};

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int t;
  cin >>t;
  while(t--)
  {
	int n;
	cin >> n;
	vector<User> v;
	for (int i=0; i<n; i++)
	{
	  int a, b;
	  cin >> a >> b;
	  v.push_back({a,b});
	}

	sort(v.begin(), v.end());

	int ans = 1;
	int mn = v[0].b;
	for (int i=1; i<n; i++)
	{
	  if (v[i].b < mn ) ans++, mn = v[i].b;
	}

	cout << ans <<"\n";
  }
}
