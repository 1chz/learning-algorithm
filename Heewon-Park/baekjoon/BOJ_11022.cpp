// Case #x: a + b = c 형태로 출력하기

#include <iostream>
using namespace std;

int main()
{
    int num, a, b;
    cin >> num;
    for (int i = 1; i <= num; i++)
    {
        cin >> a >> b;
        printf("Case #@%d; %d + %d = %d", i, a, b, a + b);
        cout << endl;
    }
    return 0;
}