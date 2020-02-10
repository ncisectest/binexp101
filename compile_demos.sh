#!/usr/bin/env bash

gcc -g -O0 -no-pie -w -m32 -o demo01 demo01.c
gcc -g -O0 -fno-stack-protector -no-pie -w -m32 -o demo0201 demo02.c
gcc -g -O0 -no-pie -w -m32 -o demo0202 demo02.c
gcc -g -O0 -w -m32 -o demo0203 demo02.c
gcc -g -w -m32 -o demo0204 demo02.c
gcc -w -m32 -o demo0205 demo02.c
