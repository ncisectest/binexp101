#include<stdlib.h>
#include<stdio.h>

int target_01;
int target_02 = 0xdeadbeef;

void win_fn() {
  char *name[2];
  name[0] = "/bin/sh";
  name[1] = NULL;
  execve(name[0], name, NULL);
}

void test_01() {
  char buffer[64];
  printf("[+] target_01   : [0x%08x] : [0x%08x]\n", &target_01, target_01);
  printf("User Input: ");
  scanf("%d%*c", &target_01);
  printf("[+] target_01   : [0x%08x] : [0x%08x]\n", &target_01, target_01);
  return;
}

void test_02() {
  char buffer[64];
  printf("[+] target_02   : [0x%08x] : [0x%08x]\n", &target_02, target_02);
  printf("User Input: ");
  gets(buffer);
  printf("Input Text: ");
  printf(buffer);
  putchar('\n');
  printf("[+] target_02   : [0x%08x] : [0x%08x]\n", &target_02, target_02);
  return;
}

void test_03() {
  int target_03;
  target_03 = 0xcafebabe;
  char buffer[64];
  printf("[+] target_03   : [0x%08x] : [0x%08x]\n", &target_03, target_03);
  printf("User Input: ");
  gets(buffer);
  printf("[+] target_03   : [0x%08x] : [0x%08x]\n", &target_03, target_03);
  return;
}

int main(int argc, char **argv, char **envp) {
  //puts("Calling function: test_01");
  //test_01();
  //putchar('\n');
  puts("Calling function: test_02");
  test_02();
  putchar('\n');
  //puts("Calling function: test_03");
  //test_03();
  //putchar('\n');
  return 0;
}
