#include <iostream>
#include <unordered_set>
using namespace std;
int sum_of_number(int no){
    int sum =0;
    while(no>0)
    {
    int a=no%10;
    no=no/10;
    sum=sum+a;
    }
    return sum;
}
int find_number(int number, int sum){
    for (;;){
        if(sum_of_number(number) == sum){
            return number;
        }
        else{
            number--;
        }
    }
    return 0;
}
int main() 
{
    int test_case = 0;
    cin>>test_case;
    for (int i =0; i<test_case; i++){
        long int number;
        cin>>number;
        int sum = sum_of_number(number) - 1;
        if( sum == 0 ){
            cout<< "0"<<endl;
        }
        else{
        cout<<find_number(number , sum)<<endl;
        }
    }

    return 0;
}