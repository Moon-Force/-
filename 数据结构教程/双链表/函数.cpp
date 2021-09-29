#include<stdio.h>
#include<malloc.h>
typedef int ElemType;
typedef struct DNode {
	ElemType data;
	struct DNode* prior;
	struct DNode* next;
}DLinkNode;
//头插法
void CreateListF(DLinkNode*& L, ElemType a[], int n) {
	DLinkNode* s;
	L = (DLinkNode*)malloc(sizeof(DLinkNode));
	L->next = L->prior = NULL;
	for (int i = 0; i < n; i++) {
		s = (DLinkNode*)malloc(sizeof(DLinkNode));
		s->data = a[i];
		s->next = L->next;
		if(L->next!=NULL)
		L->next->prior = s;
		L->next = s;
		s->prior = L;
	}
}
//尾插法
void CreateListR(DLinkNode*& L, ElemType a[], int n) {
	DLinkNode* s, * r;
	L = (DLinkNode*)malloc(sizeof(DLinkNode));
	r = L;
	for (int i = 0; i < n; i++) {
		s = (DLinkNode*)malloc(sizeof(DLinkNode));
		s->data = a[i];
		r->next = s;
		s->prior = r;
		r = s;
	}
	r->next = NULL;
}
void InitList(DLinkNode*& L) {
	L = (DLinkNode*)malloc(sizeof(DLinkNode));
	L->next = L->prior = NULL;
}
void DestroyList(DLinkNode*& L) {
	DLinkNode* pre, * p;
	pre = L;
	p = L->next;
		while (p != NULL) {
			free(pre);
			pre = p;
			p = p->next;
	}
		free(p);//删除最后一个数
}
bool ListEmpty(DLinkNode* L) {
	return (L->next == NULL);
}
int ListLength(DLinkNode* L) {
	DLinkNode* r;
	r = L;
	int a = 0;
	while (r->next != NULL) {
		r = r->next;
		a++;
	}
	return (a);
}
void DispList(DLinkNode* L) {
	DLinkNode* r = L->next;
	while (r != NULL) {
		printf("%c", r->data);
		r = r->next;
	}
	printf("\n");
}
bool GetElem(DLinkNode* L, int i, ElemType &e) {
	int j = 1;
	DLinkNode* p = L->next;
	if (i <= 0)return false;
	while (j < i && p != NULL) {
		j++;
		p = p->next;
	}
	if (p == NULL) {
		return false;
	}
	else {
		e = p->data;
		return true;
	}
}
int LocateElem(DLinkNode* L, ElemType e) {
	int i = 1;
	DLinkNode* p = L->next;
	while (p != NULL && p->data != e) {
		p = p->next;
		i++;
	}
	if (p == NULL) {
		return(0);
	}
	else {
		return (i);
	}
}
bool ListInsert(DLinkNode*& L, int i, ElemType e) {
	int j = 0;
	DLinkNode* p = L, * s;
	while (j < i - 1 && p != NULL) {
		j++;
		p = p->next;
	}
	if (p == NULL) {
		return false;
	}
	else {
		s = (DLinkNode*)malloc(sizeof(DLinkNode));
		s->data = e;
		s->next = p->next;
		if (p->next != NULL) {
			p->next->prior = s;
		}
		s->prior = p;
		p->next = s;
		return true;
	}
}
bool ListDelete(DLinkNode*& L, int i, ElemType& e) {
	int j = 0;
	DLinkNode* p = L, * q;
	if (i <= 0) return false;
	while (j < i - 1 && p != NULL) {
		j++;
		p = p->next;
	}
	if (p == NULL) {
		return false;
	}
	else {
		q = p->next;
		if (q == NULL) {
			return false;
		}
		e = q->data;
		p->next = q->next;
		if (p->next != NULL) {
			p->next->prior = p;
		}
		free(q);
		return true;
	}
}