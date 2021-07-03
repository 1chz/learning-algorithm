#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

/*
1. ||-
2. |--
3. |__
4. ||_
*/
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n, m;
  cin >> n >> m;

  if ( n == 1 )
  {
    cout << 1;
  }
  else if ( n == 2 )
  {
    cout << min((m-1)/2 + 1, 4);
  }
  else if ( m < 7)
  {
    cout << min(m, 4);
  }
  else 
    cout << m-7+5;
}
