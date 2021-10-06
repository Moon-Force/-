#include"SqStack1.cpp"
#include <stdlib.h>
double getvalue(char* postexp) {
	double d, a, b, c, e;
	SqStack1* Opnd;
	InitStack1(Opnd);
	while (*postexp!='\0')
	{
		switch (*postexp)
		{
		case '+':
			Pop1(Opnd,a);
			Pop1(Opnd, b);
			c = a + b;
			Push1(Opnd, c);
			break;
		case '-':
			Pop1(Opnd, a);
			Pop1(Opnd, b);
			c = b - a;
			Push1(Opnd, c);
			break;
		case '*':
			Pop1(Opnd, a);
			Pop1(Opnd, b);
			c = b * a;
			Push1(Opnd, c);
			break;
		case '/':
			Pop1(Opnd, a);
			Pop1(Opnd, b);
			if (a != 0) {
				c = b / a;
				Push1(Opnd, c);
				break;
			}
			else {
				printf("被除数不能为0");
				exit(0);
			}
			break;
		default:
			d = 0;
			while (*postexp >= '0' && *postexp <= '9') {
				d = d * 10 + *postexp - '0';
				postexp++;
			}
			Push1(Opnd, d);
			break;
		}
		postexp++;
	}
	GetTop1(Opnd, e);
	DestroyStack1(Opnd);
	return e;
}