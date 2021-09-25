#include<stdio.h>
#include<malloc.h>
typedef int ElmeType;
typedef struct Lnode {
	ElmeType data;
	struct Lnode* next;
}LinkNode;
void reverse(LinkNode*& L) {
	LinkNode* p = L->next,*q;
	L->next = NULL;
	while (p != NULL) {
		q = p->next;
		p->next = L->next;
		L->next = p;//ͷ�巨
		p = q;
	}
}