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
		pre = L;//每次扫描从头开始,所以时间复杂度o(n^2)
		while (pre->next != NULL && pre->next->data < p->data) {
			pre = pre->next;//接着循环
		}
		p->next = pre->next;
		pre->next = p;//头插法插入结点
		p = q;//接着扫描后续结点
	}
}