// 세 수

#include <iostream>
using namespace std;

int main()
{

    int A, B, C;
    int mid;

    cin >> A >> B >> C;

    if (A >= B)
    {
        if (B >= C)
            mid = B;
        else
        {
            if (A >= C)
                mid = C;
            else
                mid = A;
        }
    }
    else
    {
        if (A >= C)
            mid = A;
        else
        {
            if (B >= C)
                mid = C;
            else
                mid = B;
        }
    }
    cout << mid;
}