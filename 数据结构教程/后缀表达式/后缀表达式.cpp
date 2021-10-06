
#include"SqStack.cpp"
void trans(char* exp, char postexp[]) {
	char e;
	SqStack* Optr;
	InitStack(Optr);
	int i = 0;
	while (*exp != '\0') {
		switch (*exp)
		{
		case '(':
			Push(Optr, '(');
			exp++;
			break;
		case ')':
			while (!StackEmpty(Optr)) {
				GetTop(Optr, e);
				if (e != '(') {
					postexp[i++] = e;
					Pop(Optr, e);
				}
				else {
					Pop(Optr, e);
				}
		}
			exp++;
			break;
		case '+':
		case '-':
			while (!StackEmpty(Optr)) {
				GetTop(Optr, e);
				if (e != '(') {
					postexp[i++] = e;
					Pop(Optr,e);
				}
				else {
					break;
				}
			}
			Push(Optr,*exp);
			exp++;
			break;
		case '*':
		case '/':
			while (!StackEmpty(Optr)) {
				GetTop(Optr, e);
				if (e == '*' || e == '/') {
					postexp[i++] = e;
					Pop(Optr, e);
				}
				else {
					break;
				}
			}
			Push(Optr, *exp);
			exp++;
			break;
		default:
			while (*exp>='0'&&*exp<='9')
			{
				postexp[i++] = *exp;
				exp++;
			}
			postexp[i++] = '#';
			break;
		}
	}
	while (!StackEmpty(Optr)) {
		Pop(Optr, e);
		postexp[i++] = e;
	}
	postexp[i] = '\0';
	DestroyStack(Optr);
}