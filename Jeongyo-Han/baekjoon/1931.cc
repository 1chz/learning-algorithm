#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct Node{
  int s, e;
  Node(int s, int e) : s(s), e(e) {}
  bool operator<(const Node& o) const
  {
	if (e == o.e)
	  return s < o.s;
	return e < o.e;
  }
};

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  
  vector<Node> v;
  int n;
  cin >> n;
  while(n--)
  {
	int s, e;
	cin >> s >> e;

	v.push_back(Node(s, e));
  }

  int cur = -1;
  int ans = 0;
  sort(v.begin(), v.end());

  for(Node node : v)
  {
	if ( cur <= node.s )
	{
	  cur = node.e;
	  ans++;
	}
  }

  cout << ans;
}
