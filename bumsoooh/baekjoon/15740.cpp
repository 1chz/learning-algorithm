#include <iostream>
#include <stack>

using namespace std;

string add(stack<int>& sa, stack<int>& sb) {
    // sa.length() > sb.length()
    stack<int> rs;
    string res = "";
    int carry = 0;
    while(!sa.empty() && !sb.empty()) {
        rs.push((sa.top()+sb.top()+carry)%10);
        carry = (sa.top()+sb.top()+carry)/10;
        sa.pop(); sb.pop();
    }
    while(!sa.empty()) {
        rs.push((sa.top()+carry)%10);
        carry = (sa.top() + carry)/10;
        sa.pop();
    }

    if(carry > 0) rs.push(carry);
    while(!rs.empty()) {
        res += ('0'+rs.top());
        rs.pop();
    }

    return res;
}

string sub(stack<int>& sa, stack<int>& sb) {
    // sa.length() > sb.length()
    stack<int> rs;
    string res = "";
    int carry = 0, temp;
    while(!sa.empty() && !sb.empty()) {
        temp = sa.top()-sb.top()-carry;
        if(temp < 0) {
            temp += 10;
            carry = 1;
        } else {
            carry = 0;
        }

        rs.push(temp);
        sa.pop(); sb.pop();
    }
    while(!sa.empty()) {
        temp = sa.top()-carry;
        if(temp < 0) {
            temp += 10;
            carry = 1;
        } else {
            carry = 0;
        }

        rs.push(temp);
        sa.pop();
    }

    while(!rs.empty()) {
        if(rs.size() > 1 && res == "" && rs.top() == 0) {
            rs.pop();
            continue;
        }
        res += ('0'+rs.top());
        rs.pop();
    }

    return res;
}

int isGreater(string a, string b, bool isAMinus, bool isBMinus) {
    int aIdx = isAMinus;
    int bIdx = isBMinus;

    int aLen = a.length();
    int bLen = b.length();
    int aActualLen = aLen - aIdx;
    int bActualLen = bLen - bIdx;

    if(aActualLen > bActualLen) return 1;
    else if(aActualLen < bActualLen) return -1;
    else {
        while(aIdx < aLen && bIdx < bLen) {
            if(a[aIdx] > b[bIdx]) return 1;
            else if(a[aIdx] < b[bIdx]) return -1;
            aIdx++;
            bIdx++;
        }
    }

    return 0;
}

int main() {
    string a, b;
    stack<int> sa, sb;
    stack<int> longer, shorter;
    bool isAMinus = false, isBMinus = false;
    bool isLongerMinus = false, isShorterMinus = false;
    
    cin>>a>>b;

    isAMinus = a[0] == '-';
    isBMinus = b[0] == '-';
    
    for(int i=0;i<a.length();i++) {
        if(a[i] == '-') continue;
        sa.push(a[i]-'0');
    }
    for(int i=0;i<b.length();i++) {
        if(b[i] == '-') continue;
        sb.push(b[i]-'0');
    }

    if(isGreater(a, b, isAMinus, isBMinus) > 0) {
        longer = sa;
        shorter = sb;
        isLongerMinus = isAMinus;
        isShorterMinus = isBMinus;
    } else {
        longer = sb;
        shorter = sa;
        isLongerMinus = isBMinus;
        isShorterMinus = isAMinus;
    }

    string ans = "";
    if(isLongerMinus^isShorterMinus) ans = sub(longer, shorter);
    else ans = add(longer, shorter);
    
    if(ans != "0" && ((isLongerMinus && !isShorterMinus) || (isLongerMinus && isShorterMinus))) ans = "-"+ans;
    cout<<ans<<endl;
    return 0;
}