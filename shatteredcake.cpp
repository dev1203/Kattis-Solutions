#include <iostream>
#include <unordered_set>
using namespace std;
int main() 
{
   long int width = 0;
   cin>>width;
   int piece = 0;
   cin>> piece;
   long int area = 0;
   for (int i =0; i<piece; i++){
       int length_of_smaller;
       int width_of_smaller;
       cin>>length_of_smaller;
       cin>>width_of_smaller;
       area = area + (length_of_smaller * width_of_smaller);
   }
   cout<< area/width;
    return 0;
}