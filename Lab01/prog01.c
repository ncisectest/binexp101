#include<stdio.h>

int main(int argc, char *argv[]) {
  char *i = argv[1];
  printf("You wrote: %s\n", i);
  puts("Following printf call is vulnerable:");
  printf(i);
}
