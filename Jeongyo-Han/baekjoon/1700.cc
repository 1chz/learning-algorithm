#include <iostream>
#include <map>
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
  map<int, int> m;
  vector<int> input;
  map<int, vector<int>> idxes;

  for (int i=0; i<k; i++) {
    cin >> tmp;
    input.push_back(tmp);

    if (m.find(tmp) == m.end()){
      m.insert({tmp, 1});
      idxes.insert({tmp, vector<int>(1,i)});
      // cout << idxes[tmp][0] << "\n";
    } else {
      m[tmp]= m[tmp]+1;
      idxes[tmp].push_back(i);
      // cout << idxes[tmp][0] << "\n";
    }
  }

  set<int> s;
  int ans = 0;
  for (int i=0; i<input.size(); i++ ){
    int id = input[i];

    if (s.size() < n) {
      s.insert(id);
      m[id]--;
      idxes[id].erase(idxes[id].begin(), idxes[id].begin()+1);
    } else if (s.find(id) != s.end()){
      m[id]--;
      idxes[id].erase(idxes[id].begin(), idxes[id].begin()+1);
    }
    else {
      // cout << "*\n"; 
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
      // cout << val << " popped . " <<  id << " inserted\n";
      ans++;
    } 
  }
  cout << ans;
}