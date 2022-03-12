#include<stdio.h>

int main() {
	int n, m, j;
	int a[1000000];
	int b[1000000];
	int num = 0;
	scanf_s("%d %d", &n, &m);
	for (int i = 0; i < n; i++) {
		j = 0;
		scanf_s("%d", &j);
		a[j] = 1;
	}
	for (int i = 1;; i++) {
		if (a[i] != 1) {
			if (m - i >= 0) {
				b[num] = i;
				num++;
				m -= i;
			}
			else {
				break;
			}
		}
	}
	printf("%d\n", num);
	for (int i = 0; i < num; i++)
		printf("%d ", b[i]);
}