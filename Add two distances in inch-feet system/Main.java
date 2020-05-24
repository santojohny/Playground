#include<stdio.h>
struct Distance {
    int feet;
    float inch;
} d1, d2, sumOfDistances;

int main() {
    int a;
    float b;
    scanf("%d", &d1.feet);
    scanf("%f", &d1.inch);
   
    scanf("%d", &d2.feet);
    scanf("%f", &d2.inch);

    sumOfDistances.feet=d1.feet+d2.feet;
    sumOfDistances.inch=d1.inch+d2.inch;
   
    if (sumOfDistances.inch>12.0) {
        sumOfDistances.inch = sumOfDistances.inch-12.0;
        ++sumOfDistances.feet;
    }
  
    a=sumOfDistances.inch;
    b=sumOfDistances.inch-a;
    if(b==0.00)
      printf("%d\'-%.0f\"", sumOfDistances.feet, sumOfDistances.inch);
    else
      printf("%d\'-%.1f\"", sumOfDistances.feet, sumOfDistances.inch);
}