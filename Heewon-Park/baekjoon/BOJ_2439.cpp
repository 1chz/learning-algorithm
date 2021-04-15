// 별 찍기 - 2

#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 0; j < n - i; j++)
        {
            cout << ' ';
        }
        for (int k = 0; k < i; k++)
        {
            cout << '*';
        }
        cout << '\n';
    }

    return 0;
}