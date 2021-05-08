#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

struct myData
{
  int sum;
  int i;
  int j;
  myData(){};
  myData(int sum, int i, int j) : sum(sum), i(i), j(j) {};
  bool operator<(const myData& o) const
  {
	return sum < o.sum;
  }
};

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int w, n;
  cin >> w >> n;
  vector<int> v(n);

  for (int i=0; i<n; i++)
	cin >> v[i];

  vector<myData> v2;
  for (int i=0; i<n; i++)
	for (int j=i+1; j<n; j++)
	  v2.push_back(myData(v[i]+v[j],i, j));

  sort(v2.begin(), v2.end());
  int i=0, j=v2.size()-1;

  bool ans =false;
  while(i<v2.size() && j>=0)
  {
	int sum = v2[i].sum + v2[j].sum;
	if(sum > w ) j--;
	else if (sum <w) i++;
	else 
	{
	  if(v2[i].i != v2[j].i && v2[i].j != v2[j].j &&
		 v2[i].i != v2[j].j && v2[i].j != v2[j].i) {
		ans =true;
		break;
	  } else j--;
	}
  }

  if (ans)
	cout <<"YES";
  else cout <<"NO";
}
