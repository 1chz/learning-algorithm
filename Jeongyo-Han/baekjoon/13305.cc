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
  cin >> n;
  vector<int> d(n-1), cost(n);

  for (int i=0; i<n-1; i++)
      cin >> d[i];

  for (int i=0; i<n; i++)
      cin >> cost[i];

  int curCost = cost[0];
  long long answer = 0;
  for (int i=0; i<n-1; i++)
  {
      if (curCost > cost[i])
      {
          curCost = cost[i];
      }
      answer += (((long long)curCost)*d[i]);
  }
  cout << answer;
}
