#include<stdio.h>
#include<string.h>

int main(int argc, char *argv[]) {
  int intnum = 8;
  printf("[*] %d\n", intnum);
  printf("[*] %5d\n", intnum);
  printf("[*] %-10.10ld\n", intnum);
  float realnum = 3.1415;
  printf("[*] %05.2f\n", realnum);
}
