#include<stdio.h>
int main(){
	struct stu{
		char name[10];
		int num;
		int age;
		char group;
		float score;
	}stu1={"tom",12,18,'A',136.5};
	printf("%s��ѧ����%d,������%d,��%c��,����ĳɼ�%f",stu1.name,stu1.num,stu1.age,stu1.group,stu1.score);
} 
