echo "Replacing .env.example with .env"
cp .env.example .env
echo "Replacing start.sh with start.example.sh"
cp start.example.sh start.sh
echo "Replacing src/main/resources/config.example.yml src/main/resources/config.yml"
cp src/main/resources/config.example.yml src/main/resources/config.yml
P=$(pwd)
echo $P
sed -i "s+\!HOME\!+${P}+g" src/main/resources/config.yml
sed -i "s+\!HOME\!+${P}+g" start.sh
