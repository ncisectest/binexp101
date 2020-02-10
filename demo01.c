#include<stdlib.h>
#include<stdio.h>

int test_01(int x, int y) {
  int z;
  if (x > y) {
    z = x;
  }
  else {
    z = y;
  }
  return z;
}

void test_02(int **y) {
  for (int i=0; i < 6; i++) {
    printf("[+] Value of Array[%d] : [0x%08x] : [0x%08x]\n", i, &y[i], y[i]);
  }
}

int main(int argc, char **argv, char **envp) {
  int a,b,c,d,e,f;
  int x[6];

  if (argc <= 3) {
    printf("[*] Usage: %s int1 int2 int3\n", argv[0]);
    exit(0);
  }

  a = atoi(argv[1]);
  b = atoi(argv[2]);
  c = atoi(argv[3]);

  d = a + 0x20;
  d = b + c;

  e = d - 0x10;
  e = e - 0x05;

  f = test_01(a,b);

  x[0] = a;
  x[1] = b;
  x[2] = c;
  x[3] = d;
  x[4] = e;
  x[5] = f;

  test_02(x);

  return 0;
}
