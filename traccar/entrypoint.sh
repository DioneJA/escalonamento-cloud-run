#!/bin/sh

echo "Configurando o MYSQL"

envsubst < /opt/traccar/conf/traccar.env.xml > /opt/traccar/conf/traccar.xml

echo "/||||||||||||||||||||||\ INICIANDO /||||||||||||||||||||||\\"
echo ""
echo ""

exec "$@"
