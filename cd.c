#include <stdio.h>

int main(){
	int arr[10000000];
	int i=0;
	while(fgets(arr[i],109,stdin)){
		i++;
	}
	for(int j=0;j<strlen(arr[0]);j++){
			 printf("%d",arr[j]);
	}
	printf("%s\n","" );
	return 0;
}