#include"后缀表达式.cpp"
#include "后缀表达式运算.cpp"
int main() {
	char exp[] = "(56-20)/(4+2)";
	char postexp[MaxSize];
	trans(exp, postexp);
	printf("中缀表达式:\n");
	printf("%s\n", exp);
	printf("后缀表达式:\n");
	printf("%s\n", postexp);
	printf("后缀表达式的值\n");
	printf("%g", getvalue(postexp));
	return 0;
}