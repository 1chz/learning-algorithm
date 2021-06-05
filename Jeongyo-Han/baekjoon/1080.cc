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

  int row, col;
  cin>>row>>col;
  vector<string> v;
  vector<string> v2;
  string tmp;
  for (int i=0; i<row; i++)
  {
	cin >> tmp;
	v.push_back(tmp);
  }
  for (int i=0; i<row; i++)
  {
	cin >> tmp;
	v2.push_back(tmp);
  }

  int ans = 0;
  for (int i=0; i<row; i++)
  {
	for (int j=0; j<col; j++)
	{
	  if (v[i][j] != v2[i][j])
	  {
		if (i+2 >= v.size()) continue; 
		if (j+2 >= v[0].size()) continue;
		ans++;
		for (int k=0; k<3; k++)
		  for (int l=0; l<3; l++)
			v[i+k][j+l]^=1;
	  }
	}
  }

  bool isSame = true;
  for (int i=0; i<row; i++)
	for (int j=0; j<col; j++)
	  if (v[i][j] != v2[i][j]) isSame= false;

  if (isSame)
	cout << ans;
  else cout << -1;
}
