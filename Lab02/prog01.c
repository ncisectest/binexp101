#include<stdio.h>
#include<string.h>

void main(int argc, char *argv[]) {
  int i = atoi(argv[1]);
  unsigned short s = i;
  char buf[50];
  if (s > 10) {
    return;
  }
  memcpy(buf, argv[2], i);
  buf[i] = '\0';
  printf("%s\n", buf);
  return;
}
