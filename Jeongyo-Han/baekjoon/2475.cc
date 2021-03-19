#include <iostream>
#include <string>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int ans =0;
  for (int i=0; i<5; i++)
  {
	int tmp;
	cin >> tmp;
	ans += tmp*tmp;
  }
  cout << ans%10;

}
