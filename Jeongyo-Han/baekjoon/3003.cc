#include <iostream>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int a[6] = {1, 1, 2, 2, 2, 8};
  for (int i=0; i<6; i++)
  {
	int tmp;
	cin >> tmp;
	cout << a[i]-tmp << " ";
  }
}
