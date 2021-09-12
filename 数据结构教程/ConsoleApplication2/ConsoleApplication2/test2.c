#include<stdio.h>
#include<string.h>
int main() {
	char str[] = "ggle";
	char* pstr = str;
	int len = strlen(str);
	int i;
	for (i = 0; i < len; i++) {
		printf("%c", *(pstr + i));
	}
	printf("\n");
	for (i = 0; i < len; i++) {
		printf("%c", pstr[i]);
	}
	printf("%\n");
	for (i = 0; i < len; i++) {
		printf("%c", *(str + i));
	}

}