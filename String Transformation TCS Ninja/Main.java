#include<stdio.h>
#include<string.h>
int main(){
	char string1[20],string2[20],string3[20];
  	scanf("%s%s%s",&string1,&string2,&string3);
  	int len1 = strlen(string1);
  	int len2 = strlen(string2);
  	int i;
  	for(i=0;i<len1;i++){
        if(string1[i] == 'a' ||string1[i] == 'e' ||string1[i] == 'i'||string1[i] == 'o' ||string1[i] == 'u' )
          	string1[i] = '$';
    }
  	
    for(i=0;i<len2;i++){
        if (string2[i] >= 'a' && string2[i] <= 'z'){
          	if(string2[i] == 'a' ||string2[i] == 'e' ||string2[i] == 'i'||string2[i] == 'o' ||string2[i] == 'u' )
               continue;
            else
             	string2[i] = '#';
        }
    }
  	
  	int c = 0;
   
    while (string3[c] != '\0') {
      if (string3[c] >= 'a' && string3[c] <= 'z') {
         string3[c] = string3[c] - 32;
      }
      c++;
   }

  	printf("%s%s%s",string1,string2,string3);
  
  return 0;
}