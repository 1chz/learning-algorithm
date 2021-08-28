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
  string s;

  cin >> n;
  cin >> s;

  if (n==1)
  {
	cout << "HM\n";
	return 0;
  }



  int ans1 = 0, ans2 =0;
  for (int i=0; i<n-1; i++)
  {
	if (s[i] == 'H')
	  ans1++;
	else ans2++;
  }

  if (ans1< ans2)
	cout << "M\n";
  else if(ans2 <ans1)
	cout << "H\n";
  else 
  {
	if (s[n-2] =='H')
	  cout << "M\n";
	else cout << "H\n";
  }
}
