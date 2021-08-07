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

  int x, y, h, w;
  cin >> x >> y >> w >> h;

  int a = min(w-x, h-y);
  int b = min(x-0, y-0);
  cout << min(a, b);
}
