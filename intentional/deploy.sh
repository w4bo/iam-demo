#!/bin/bash
set -exo

if [ -f .env ]; then
  export $(cat .env | sed 's/#.*//g' | xargs)
fi

./gradlew clean war
rm -rf "${TOMCAT_PATH}\IAM-Demo"
cp build/libs/IAM-Demo.war "${TOMCAT_PATH}\webapps"