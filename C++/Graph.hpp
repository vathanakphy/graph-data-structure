#include <iostream>
#include <list>
#include <map>
#include <queue>
#include <vector>
#include <stack>
#include <utility> 
#include <algorithm>
using namespace std;

bool findChar(char find, vector<char> listChar) {
    for (char i : listChar) {
        if (i == find) {
            return true;
        }
    }
    return false;
}
class Graph {
    map<char, list<pair<char, int>>> adjList;
public:
    void addEdge(char u, char v, int w = 1) {
        adjList[u].push_back({v, w});
        adjList[v].push_back({u, w}); 
    }
    void print() {
        for (auto i : adjList) {
            cout << i.first << " -> ";
            for (auto j : i.second) {
                cout << "(" << j.first << ", " << j.second << ") ";
            }
            cout << endl;
        }
    }
    void BFS(char start) {
        queue<char> Queue;
        vector<char> visited;
        Queue.push(start);
        visited.push_back(start);
        while (!Queue.empty()) {
            char current = Queue.front();
            cout << current << " ";
            Queue.pop();
            for (auto nb : adjList[current]) {
                if (!findChar(nb.first, visited)) {
                    visited.push_back(nb.first);
                    Queue.push(nb.first);
                }
            }
        }
    }
    void DFS(char start){
        stack<char> Stack;
        vector<char> visited;
        Stack.push(start);
        visited.push_back(start);
        while (!Stack.empty()) {
            char current = Stack.top();
            Stack.pop();
            cout << current << " ";
            for (auto nb = adjList[current].rbegin();nb!=adjList[current].rend();++nb) {
                if (!findChar(nb->first, visited)) {
                    visited.push_back(nb->first);
                    Stack.push(nb->first);
                }
            }
        }
    }
};
