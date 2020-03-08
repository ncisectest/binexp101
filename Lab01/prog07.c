#include<stdio.h>
#include<string.h>

void win() {
  puts("We have successfully changed the code path.");
}

void function() {
  char outbuf[512];
  char buffer[512];

  char userInput[512];
  gets(userInput);

  sprintf(buffer, "ERR Wrong Command: %.400s", userInput);
  sprintf(outbuf, buffer);

  puts(outbuf);
}

int main(int argc, char *argv[]) {
  function();
}
