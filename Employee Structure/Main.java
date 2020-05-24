#include <stdio.h>
 
/*structure declaration*/
struct employee{
    char name[30];
    int empId;
    int age;
    char designation[50];
    int salary;
}emp;
 
int main()
{
    /*declare structure variable*/
     
    /*read employee details*/
    printf("Enter name:\n");scanf("%s",emp.name); 
    printf("Enter ID:\n");scanf("%d",&emp.empId);
    printf("Enter age:\n");scanf("%d",&emp.age);
    printf("Enter designation:\n");scanf("%s",emp.designation);
    printf("Enter Salary:\n");scanf("%d",&emp.salary);
     
    /*print employee details*/
    printf("Employee Details\n");
    printf("Name of the Employee : %s\n",emp.name);
    printf("ID of the Employee : %d\n",emp.empId);
    printf("Age of the Employee : %d\n",emp.age);
    printf("Designation of the Employee : %s\n",emp.designation);
    printf("Salary of the Employee : %d",emp.salary);
    return 0;
}