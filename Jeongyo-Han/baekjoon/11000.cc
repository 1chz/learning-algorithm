#include <iostream>
#include <vector>
#include <queue>

using namespace std;
struct Edge{
    int f, t;
    Edge(int f, int t) : f(f), t(t) {}
    bool operator< (const Edge & e) const {
        return f > e.f;
    }
};

int main(){
    int n;
    cin >> n;

    priority_queue<Edge> pq;
    for (int i=0; i<n; i++){
        int f, t;
        cin >> f >> t;
        pq.push(Edge(f, t));
    }

    priority_queue<int> tq;
    while(!pq.empty()){
        Edge cur = pq.top();
        pq.pop();
        if (tq.empty()) tq.push(-cur.t);
        else {
            if (-tq.top() <= cur.f ) {
                tq.pop();
                tq.push(-cur.t);
            } else {
                tq.push(-cur.t);
            }
        }
    }
    cout << tq.size();
    return 0;
};