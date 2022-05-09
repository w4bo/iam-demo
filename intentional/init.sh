echo "Replacing .env.example with .env"
cp .env.example .env
echo "Replacing start.sh with start.example.sh"
cp start.example.sh start.sh
echo "Replacing src/main/resources/config.example.yml src/main/resources/config.yml"
cp src/main/resources/config.example.yml src/main/resources/config.yml
echo "Replacing ../intentional-web/js/config.example.js ../intentional-web/js/config.js"
cp ../intentional-web/js/config.example.js ../intentional-web/js/config.js
echo "Replacing ../intentional-assess/js/config.example.js ../intentional-assess/js/config.js"
cp ../intentional-assess/js/config.example.js ../intentional-assess/js/config.js

P=$(pwd)
echo $P
sed -i "s+\!HOME\!+${P}+g" src/main/resources/config.yml
sed -i "s+\!HOME\!+${P}+g" start.sh
