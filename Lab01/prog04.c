#include<stdio.h>
#include<string.h>

int main(int argc, char *argv[]) {
  char buffer[1024] = "Hello";
  int intnum = 3;
  float realnum = 3.14151617;
  fprintf(stdout, "[*] fprintf %d\n", intnum);
  printf("[*] %08i\n", intnum);
  printf("[*] %u\n", intnum);
  printf("[*] %.4f\n", realnum);
  printf("[*] %x\n", intnum);
  printf("[*] %p\n", intnum);
  printf("[*] %s\n", buffer);
  printf("BLAHBLEHBLUE%n\n", &intnum);
  printf("[*] %d\n", intnum);
  printf("[*] %d\n");
  printf("[*] %i\n");
  printf("[*] %u\n");
  printf("[*] %f\n");
  printf("[*] %x\n");
  printf("[*] %p %p %p %p %p\n");
}
