#!/usr/bin/env bash

apt-get update
apt-get install -y gdb
apt-get install -y build-essential
apt-get install -y g++-multilib
apt-get install -y git
apt-get install -y python3
apt-get install -y python3-pip
apt-get install -y python3-dev
apt-get install -y python3-setuptools
apt-get install -y python3-wheel
apt-get install -y openjdk-11-jre-headless
apt-get install -y openjdk-11-jdk-headless
pip3 install ropper
pip3 install --upgrade git+https://github.com/arthaud/python3-pwntools.git
wget -q -O- https://github.com/hugsy/gef/raw/master/scripts/gef.sh | sh
snap install --classic atom
apt-get install -y radare2
ulimit -c unlimited
echo "kernel.randomize_va_space" > /etc/sysctl.d/000-labsetup.conf
