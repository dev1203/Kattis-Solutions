#include <stdio.h>
#include <string.h>

double main(){
	char arr[1][100009];
	double underscore;
	double uppercase;
	double lowercase;
	double extra;
	int i=0;
		fgets(arr[0],100009,stdin);
	
		double total=(double)strlen(arr[0])-1;

		for(int j=0;j<total;j++){
			if(arr[0][j]>='A' && arr[0][j]<='Z'){
				uppercase++;
			}
			else if(arr[0][j]>='a' && arr[0][j]<='z'){
				lowercase++;
			}
			else if(arr[0][j]=='_'){
				underscore++;
			}
			else{
				extra++;
			}
		}

		printf("%.15lf\n",underscore/total);
		printf("%.15lf\n",lowercase/total);
		printf("%.15lf\n",uppercase/total);
		printf("%.15lf\n",extra/total);
	return 0;
}
