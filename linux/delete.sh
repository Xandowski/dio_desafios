#!/bin/bash

#Script para deletar qualquer uma das pastas, usuários e grupos que serão criados no script criacao_usuarios.sh.

#Excluir diretórios:
rm -Rf /adm/ /publico/ /ven/ /sec/

#Excluir usuários:
userdel -r -f carlos
userdel -r -f maria
userdel -r -f joao
userdel -r -f sebastiana
userdel -r -f debora
userdel -r -f roberto
userdel -r -f josefina
userdel -r -f amanda
userdel -r -f rogerio

#Excluir grupos:
groupdel GRP_ADM
groupdel GRP_SEC
groupdel GRP_VEN