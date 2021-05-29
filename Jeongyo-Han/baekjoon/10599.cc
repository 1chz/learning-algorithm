#include <iostream>
#include <algorithm>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  while(true)
  {
	int a, b, c, d;
	cin >> a >>  b >> c >> d;
	if ( a==0 && b == 0 && c==0 && d==0)
	  break;

	cout << min(c,d)-max(a,b)  << " " << max(c,d)-min(a,b) <<"\n";

  }

}
