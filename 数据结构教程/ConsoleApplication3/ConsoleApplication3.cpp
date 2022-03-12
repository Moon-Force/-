#include<stdio.h>
#include<algorithm> 
using namespace std;
bool cmp(const int& a, const int& b) {
	return a < b;
}
int main() {
	int n;
	int k;
	int flag = -1;
	int sum = 0;
	int x[52], y[52];
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &k);
		for (int j = 0; j < k; j++) {
			scanf("%d", &x[j]);
		}
		sort(x, x + k);
		for (int j = 0; j < k; j++) {
			scanf("%d", &y[j]);
		}
		sort(y, y + k);
		for (int l = 0; l < k; l++)
		{
			for (int h = 0; h < k; h++) {
				if (x[l] > y[h] && flag != 2) {
					flag = 2;
					y[h] = 10000;
				}
			}
			if (flag != 2) {
				for (int h = 0; h < k; h++) {
					if (x[l] == y[h]) {
						flag = 1;
						y[h] = 10000;
					}
				}
			}
			if (flag == 2) {
				sum += 2;
			}
			if (flag == 1) {
				sum += 1;
			}
		}
	}
}