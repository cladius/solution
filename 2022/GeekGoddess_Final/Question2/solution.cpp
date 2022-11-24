/* Read input from STDIN. Print your output to STDOUT*/ 
#include <bits/stdc++.h>
using namespace std; 

int visit[100005]={0}; 
vector<int> gr[100005]; 

void dfs(int i,vector<int> gr[100005]){ 
    visit[i]=1; 
    for(int child:gr[i]){ 
        if(visit[child]!=1){ 
            dfs(child,gr); 
            } 
        } 
    } 
int main(int argc, char *a[]) { 
    //Write code here 
    int n,m,x,y; 
    cin>>n>>m; 
    // cout<<n<<m; 
    //gr.resize(n); 
    for(int i=0;i<m;i++){ 
        cin>>x>>y; 
        //cout<<x<<y; 
        gr[x].push_back(y); 
        // cout<<gr[x]; 
        gr[y].push_back(x); 
    } 
    int c=0; 
    for(int i=1;i<=n;i++){ 
        //cout<<visit[i]<<endl; 
        if(visit[i]!=1){
            dfs(i,gr); 
            c++; 
        } 
    } 
    cout<<c-1;
}