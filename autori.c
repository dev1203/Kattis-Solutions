#include <stdio.h>
#include <string.h>

int main(){
	char arr[10][109];
	int i=0;
	while(fgets(arr[i],109,stdin)){
		i++;
	}
	for(int j=0;j<strlen(arr[0])-1;j++){
		if(arr[0][j]>='A'&&arr[0][j]<='Z'){
			 printf("%c",arr[0][j]);
		}
	}
	printf("%s\n","" );
	return 0;
}