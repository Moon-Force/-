#include<stdio.h>
#include<malloc.h>
#include "¡¥±Ì’ª.cpp"
bool Match(char exp[], int n) {
	char e;
	int i=0;
	bool match=true;
	LinkStNode* s;
	InitStack(s);
	while (i<n&&match)
	{
		if (exp[i] == '(')
		{
			Push(s, exp[i]);
		}
		else if (exp[i] == ')') {
			if (GetTop(s,e)==true) {
				if (e != '(') {
					match = false;
				}
				else {
					Pop(s, e);
				}
			}
			else
			{
				match = false;
			}
		}
		i++;
	}
}