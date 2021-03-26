#include <iostream>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int a[3];
  int c[3];

  for (int i=0; i<3; i++) cin>> a[i];
  for (int i=0; i<3; i++) cin>> c[i];
  cout << c[0] - a[2] << " " << c[1]/a[1] << " " << c[2]-a[0];

}
