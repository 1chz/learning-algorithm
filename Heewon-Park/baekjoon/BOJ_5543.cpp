// 상근날드

#include <iostream>
using namespace std;

int main()
{
    int ham[3], bev[2], ham_min, bev_min;

    for (int i = 0; i < 3; i++)
    {
        cin >> ham[i];
    }
    for (int i = 0; i < 2; i++)
    {
        cin >> bev[i];
    }

    ham_min = ham[0];
    bev_min = bev[0];

    for (int i = 0; i < 3; i++)
    {
        if (ham_min > ham[i])
            ham_min = ham[i];
    }
    for (int i = 0; i < 2; i++)
    {
        if (bev_min > bev[i])
            bev_min = bev[i];
    }

    cout << ham_min + bev_min - 50 << endl;

    return 0;
}