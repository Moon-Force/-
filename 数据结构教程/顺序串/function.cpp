#include<stdio.h>
#define MaxSize 50
typedef struct {
	char data[MaxSize];
	int length;
}SqString;
void StrAssign(SqString& s, char cstr[]) {
	int i;
	for (i = 0; cstr[i] != '\0'; i++) {
		s.data[i] = cstr[i];
		s.length = i;
	}
}
void Destroy(SqString& s) {

}


void StrCopy(SqString& s ,SqString t) {
	int i;
	for (i = 0; i < t.length; i++) {
		s.data[i] = t.data[i];
	}
	s.length = t.length;
}
bool StrEqual(SqString s, SqString t) {
	bool same = true; int i;
	if (s.length != t.length) {
		same = false;
	}
	else
	{
		for (i = 0; i < s.length; i++) {
			if (s.data[i] != t.data[i]) {
				same = false;
				break;
			}
		}
	}
	return same;
}
int StrLength(SqString s) {
	return s.length;
}
SqString Concat(SqString s, SqString t) {
	SqString str;
	int i;
	str.length = s.length + t.length;
	for (i = 0; i < s.length; i++) {
		str.data[i] = s.data[i];
	}
	for (i = 0; i < t.length; i++) {
		str.data[s.length + 1] = t.data[i];
	}
}
SqString SubStr(SqString s, int i, int j) {
	int k;
	SqString str;
	str.length = 0;
	if (i <= 0 || i > s.length || j<0 || i + j - 1>s.length) {
		return str;
	}
	for (k = i - 1; k < i + j - 1; k++) {
		str.data[k - i + 1] = s.data[k];
	}
	str.length = j;
	return str;
}
SqString InsStr(SqString s1, int i, SqString s2) {
	int j;
	SqString str;
	str.length = 0;
	if (i<0 || i>s1.length - 1) {
		return str;
	}
	for (j = 0; j < i - 1; j++) {
		str.data[j] = s1.data[j];
	}
	for (j = 0; j < s2.length; j++) {
		//i-1是插入位置,不停的加j
		str.data[i + j - 1] = s2.data[j];
	}
	for (j = i - 1; j < s1.length; j++) {
		//在s1断点处重新插入
		str.data[s2.length + j] = s1.data[j];
	}
	str.length = s1.length + s2.length;
	return str;
}
SqString DelStr(SqString s, int i, int j) {
	int k;
	SqString str;
	str.length=0;
	if (i<0 || j<0 || i>s.length|| i + j>s.length+1) {
		return str;
	}
}
SqString RepStr(SqString s, int i, int j, SqString t) {
	int k;
	SqString str;
	str.length = 0;
	for (k = 0; k < i - 1; k++) {
		str.data[k] = t.data[k];
	}
	for (k = 0; k < t.length; k++) {
		str.data[i - 1 + k] = t.data[k];
	}
	for (k = i + j - 1; k < s.length; k++) {
		str.data[t.length + k - j] = s.data[k];
	}
}
void DispStr(SqString s) {
	int i;
	if (s.length > 0) {
		for (i = 0; i < s.length; i++) {
			printf("%c", s.data[i]);
		}
		printf("\n");
	}
}