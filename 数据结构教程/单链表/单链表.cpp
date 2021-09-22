#include<stdio.h>
#include<malloc.h>
typedef char ElemType;
typedef struct LNode
{
	ElemType data;
	struct LNode *next;
}LinkNode;
void CreateListF(LinkNode*& L, ElemType a[], int n)
//头插法建立单链表
//头插法输出链表时会倒序输出
{
	LinkNode* s;
	L = (LinkNode*)malloc(sizeof(LinkNode));
	L->next = NULL;
	for (int i = 0; i < n; i++) {
		s = (LinkNode*)malloc(sizeof(LinkNode));//创建新结点
		s->data = a[i];
		s->next = L->next;//先把s的next指向L的next
		L->next = s;//然后再把L的next指向s
	}
}
void CreateListR(LinkNode*& L, ElemType a[], int n) {
	//尾插法建立单链表
	LinkNode* s, * r;
	L = (LinkNode*)malloc(sizeof(LinkNode));
	L->next = NULL;
	for (int i = 0; i < n; i++) {
		s = (LinkNode*)malloc(sizeof(LinkNode));
		s->data = a[i];
		r->next = s;//把r的next指向s
		r = s;//再使r后退一位
	}
}
//初始化线性表
void InitList(LinkNode *&L) {
	L = (LinkNode*)malloc(sizeof(LinkNode));
	L->next = NULL;
}
//销毁线性表
void DestroyList(LinkNode*& L) {
	LinkNode* pre = L, * p = pre->next;
	while (p!=NULL) //判断下个结点是否为空
	{
		free(pre);
		pre = p;
		p = pre->next;
	}
	//当判断后面的没有结点后,销毁最后一个数
	free(pre);
}
//判断线性表是否为空
bool ListEmpty(LinkNode* L) {
	return(L->next == NULL);
}
//求线性表的长度
int ListLength(LinkNode* L) {
	int i = 0;
	LinkNode* p = L;
	while (p->next != NULL) {
		i++;
		p = p->next;
	}
	return(i);
}
// 输出线性表
void DispList(LinkNode* L) {
	LinkNode* p = L->next;
	while (p != NULL) {
		printf("%c", p->data);
		p = p->next;
	}
}
// 求某个线性表的第i个元素值
bool GetElem(LinkNode* L, int i, ElemType &e){
	int j = 0;
	if (i <= 0) {
		return false;
	}
	LinkNode* p = L;
	while (j < i && p!=NULL)
	{
		j++;
		p = p->next;
	}
	if (p == NULL) {
		return false;
	}
	else
	{
		e = p->data;
		return true;
	}
}
int LocateElem(LinkNode* L, ElemType e) {
	int i = 1;
	LinkNode* p = L->next;
	while (p != NULL && p->data != e) {
		p = p->next;
		i++;
	}
	if (p == NULL) {
		return (0);
	}
	else {
		return (i);
	}
}