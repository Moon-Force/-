#include<stdio.h>
#include<malloc.h>
#include<stack>
#define MaxSize 50
typedef struct {
	int i;
	int j;
	int di;
}Box;
typedef struct {
	Box data[MaxSize];
	int top;
}StType;
bool mgpath(int xi, int yi, int xe, int ye) {
	Box path[MaxSize], e;
	int i, j;
	int di, il, jl;
	int k;
	bool find;
	StType* st;
	InitStack(st);
	e.i = xi; e.j = yi; e.di = -1;
	
}