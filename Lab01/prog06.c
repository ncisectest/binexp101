#include<stdio.h>
#include<string.h>

int main(int argc, char *argv[]) {
  // char buffer1[16];
  char buffer2[32];
  char buffer3[64];
  int numbytesread = read(0, buffer3, sizeof(buffer3));
  buffer3[numbytesread] = '\0';
  snprintf(buffer2, 31, "The value is %s", buffer3);
  buffer2[31] = '\0';
}
