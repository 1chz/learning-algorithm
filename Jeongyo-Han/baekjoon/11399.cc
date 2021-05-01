#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i=0; i<n; i++)
        cin >> a[i];

    sort(a.begin(), a.end());

    int ans =0; 
    int psum = 0;
    for (int i=0; i<a.size(); i++)
    {
        psum += a[i];
        ans += psum;
    }
    cout  << ans;
}
