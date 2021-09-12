#include<stdio.h>
int main(){
	struct stu{
		char name[10];
		int num;
		int age;
		char group;
		float score;
	}stu1={"tom",12,18,'A',136.5};
	printf("%s的学号是%d,年龄是%d,在%c组,今年的成绩%f",stu1.name,stu1.num,stu1.age,stu1.group,stu1.score);
} 
