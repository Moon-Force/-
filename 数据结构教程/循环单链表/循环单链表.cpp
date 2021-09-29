#include<stdio.h>
#include<malloc.h>
typedef int ElemType;
typedef struct Lnode {
	ElemType data;
	struct Lnode* next;
}LinkNode;
void CreateListF(LinkNode*& L, ElemType a[], int n) {
	LinkNode* s, int i;
	L = (LinkNode*)malloc(sizeof(LinkNode));
	L->next = NULL;
	for(int i)
}