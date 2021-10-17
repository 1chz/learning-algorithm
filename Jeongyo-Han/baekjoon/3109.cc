#include <iostream>
#include <vector>

using namespace std;
int ans;

bool go(int row, int col, vector<string>& map) 
{
  int size = map[0].size();
  if (size-1 == col) {
    return 1;
  }

  if (map[row][col] == '.'){
    map[row][col] = 'x';
    for (int i=-1; i<=1; i++){
      if (row+i < 0 || row+i >= map.size()) continue;
      if (go(row+i, col+1, map))  return 1;
    }
  }
  return 0;
}

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int row, col;
  cin >> row >> col;
  vector<string> map(row);

  for (int i=0; i<row; i++)
    cin>> map[i];

  for (int i=0; i<row; i++){
    if(go(i, 0, map)) ans++;
  }
  cout<< ans;
}
