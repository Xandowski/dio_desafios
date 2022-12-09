#!/bin/bash

echo "Update do sistema"
apt update -y && apt upgrade -y
echo "Instalacao das dependencias"
apt install unzip -y

cd /tmp

echo "Fazendo download da aplicacao"
wget https://github.com/Xandowski/dio-pokedex/archive/refs/heads/main.zip

echo "Descompactando arquivos"
unzip main.zip

mv dio-pokedex-main/ ./htdocs

echo "Movendo arquivos para o container"
docker cp htdocs apache:/usr/local/apache2/

cd ..

echo "Removendo arquivos"
rm -rf main.zip dio-pokedex-main