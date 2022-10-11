#!/bin/bash

#caso queira que o usuario mude a senha padrao:
#passwd usuario -e

echo "Criando pastas..."
mkdir /publico /adm /ven /sec

echo "Criando grupos..."
groupadd GRP_ADM
groupadd GRP_VEN
groupadd GRP_SEC

echo "Criando usuários..."
useradd carlos -c "Usuario grupo adm" -m -s /bin/bas -p $(openssl passwd -crypt user01) -G GRP_ADM
useradd maria -c "Usuario grupo adm" -m -s /bin/bash -p $(openssl passwd -crypt user02) -G GRP_ADM
useradd joao -c "Usuario grupo adm" -m -s /bin/bash -p $(openssl passwd -crypt user03) -G GRP_ADM

useradd debora -c "Usuario grupo venda" -m -s /bin/bas -p $(openssl passwd -crypt user04) -G GRP_VEN
useradd sebastiana -c "Usuario grupo venda" -m -s /bin/bash -p $(openssl passwd -crypt user05) -G GRP_VEN
useradd roberto -c "Usuario grupo venda" -m -s /bin/bash -p $(openssl passwd -crypt use06) -G GRP_VEN

useradd josefina -c "Usuario grupo secretariado" -m -s /bin/bas -p $(openssl passwd -crypt user07) -G GRP_SEC
useradd amanda -c "Usuario grupo secretariado" -m -s /bin/bash -p $(openssl passwd -crypt user08) -G GRP_SEC
useradd rogerio -c "Usuario grupo secretariado" -m -s /bin/bash -p $(openssl passwd -crypt user09) -G GRP_SEC

echo "Alterando os donos dos diretórios..."
chown root:GRP_ADM /adm
chown root:GRP_VEN /ven
chown root:GRP_SEC /sec

echo "Alterando permissões..."
chmod 770 /adm
chmod 770 /ven
chmod 770 /sec
chmod 777 /publico
