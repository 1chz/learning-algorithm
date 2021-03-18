#include <iostream>

using namespace std;

int main() {
    cin.tie(0);
    ios_base::sync_with_stdio(false);
    
    int n;
    cin>>n;
    
    int sum =0;
    for(int i=1;i<=n;i++) sum+=i;
    cout<<sum<<endl;
    return 0;
}
