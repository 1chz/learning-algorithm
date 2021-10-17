#include <iostream>
#include <set>
#include <vector>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n, k;
  int tmp;
  cin >> n >> k;
  vector<int> input;
  vector<vector<int>> idxes(k+1);

  for (int i=0; i<k; i++) {
    cin >> tmp;
    input.push_back(tmp);
    idxes[tmp].push_back(i);
  }

  set<int> s;
  int ans = 0;
  for (int i=0; i<input.size(); i++ ){
    int id = input[i];

    if (s.size() < n) {
      s.insert(id);
      idxes[id].erase(idxes[id].begin(), idxes[id].begin()+1);
    } else if (s.find(id) != s.end()){
      idxes[id].erase(idxes[id].begin(), idxes[id].begin()+1);
    }
    else {
      int mx = 0;
      int val = -1;

      for (auto& j : s){
        if (idxes[j].size() == 0 ) {
          mx = 1e9;
          val = j;
        } else if ( idxes[j][0] > mx ) {
          mx = idxes[j][0];
          val = j;
        }
      }

      s.erase(val);
      s.insert(id);
      idxes[id].erase(idxes[id].begin(),idxes[id].begin() +1);
      ans++;
    } 
  }
  cout << ans;
}