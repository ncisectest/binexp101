from pwn import *

binary = ELF("./demo0201")

address = p32(0xdeadbeef)
cmdarg1 = ""
payload = ""
envval = ""

io = process([binary.path, cmdarg1], env={"ENVVAR": envval})
io.sendline(payload)
io.interactive()
