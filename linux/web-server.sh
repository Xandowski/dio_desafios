#!/bin/bash

# Provisionamento de um web server com apache para distros derivadas do debian
# executar como root
echo "Update do sistema"
apt update -y && apt upgrade -y
echo "Instalacao das dependencias"
apt install apache2 unzip -y

cd /tmp

echo "Fazendo download da aplicacao"
wget https://github.com/Xandowski/dio-pokedex/archive/refs/heads/main.zip

echo "Descompactando arquivos"
unzip main.zip

cd dio-pokedex-main

echo "Movendo arquivos"
cp -R * /var/www/html/

cd ..

echo "Removendo arquivos"
rm main.zip dio-pokedex-main
