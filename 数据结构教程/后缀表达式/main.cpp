#include"��׺���ʽ.cpp"
#include "��׺���ʽ����.cpp"
int main() {
	char exp[] = "(56-20)/(4+2)";
	char postexp[MaxSize];
	trans(exp, postexp);
	printf("��׺���ʽ:\n");
	printf("%s\n", exp);
	printf("��׺���ʽ:\n");
	printf("%s\n", postexp);
	printf("��׺���ʽ��ֵ\n");
	printf("%g", getvalue(postexp));
	return 0;
}