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

  int t=1;
  while(true)
  {
	int l, p, v;
	cin >> l >> p >> v;
	if(l==0)
	  return 0;

	int ans = 0;

	int k = v/p;
	int rem = v%p;
	ans = k*l;

	if ( l > rem ) ans += rem;
	else ans += l;
	cout << "Case " << t++ << ": " << ans << "\n";
  }

}
