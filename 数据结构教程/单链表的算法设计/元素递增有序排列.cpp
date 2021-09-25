#include<stdio.h>
#include<malloc.h>
typedef int ElemType;
typedef struct Lnode {
	ElemType data;
	struct Lnode* next;
}LinkNode;
void sort(LinkNode*& L)
{
	LinkNode* p, * pre, * q;
	p = L->next->next;
	L->next->next = NULL;
	while (p != NULL) {
		q = p->next;
		pre = L;//ÿ��ɨ���ͷ��ʼ,����ʱ�临�Ӷ�o(n^2)
		while (pre->next != NULL && pre->next->data < p->data) {
			pre = pre->next;//����ѭ��
		}
		p->next = pre->next;
		pre->next = p;//ͷ�巨������
		p = q;//����ɨ��������
	}
}