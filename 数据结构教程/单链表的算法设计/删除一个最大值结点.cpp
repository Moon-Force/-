#include<stdio.h>
#include<malloc.h>
typedef int ElemType;
typedef struct Lnode {
	ElemType data;
	struct Lnode* next;
}LinkNode;
void delmaxnode(LinkNode*& L) {
	LinkNode* p = L->next, * pre = L, * maxp = p, * maxpre = pre;
	while (p != NULL) {
		if (maxp->data < p->data) {
			maxp = p;
			maxpre = pre;//影子指针移动到主指针
		}
		pre = p;//p,pre同步后移一个结点
		p = p->next;
	}
	maxpre->next = maxp->next;//删除maxp结点
	free(maxp);
}