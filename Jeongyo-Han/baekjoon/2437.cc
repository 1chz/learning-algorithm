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
  vector<int> arr(n);

  for (int i=0;i<n;i++) {
    cin >> arr[i];
  }
  sort(arr.begin(), arr.end());

  int sum=0;
  for (int i=0;i<n; i++){
    if (sum+1 < arr[i]) break;
    sum += arr[i];
  }

  cout << sum+1;
}