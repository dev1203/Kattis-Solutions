#include <iostream>
#include <unordered_set>
using namespace std;
int main() 
{
    int jack;
    int jill;
    cin >> jack;
    cin >> jill;
    while( jack !=0 && jill!=0){
        unordered_set<int> intSet; 
        for (int i = 0;i < jack + jill; i++){
            int num;
            cin>>num;
            intSet.insert(num);
        }
        cout<<((jack+jill) - intSet.size())<<endl;
        cin >> jack;
        cin >> jill;
    }
    return 0;
}