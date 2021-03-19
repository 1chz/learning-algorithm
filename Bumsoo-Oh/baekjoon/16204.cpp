#include <iostream>

using namespace std;

int main() {
	int n,m,k;
	cin>>n>>m>>k;
	cout<<min(m, k)+min(n-m, n-k)<<endl;
	return 0;
}
