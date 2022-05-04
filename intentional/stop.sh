#!/bin/bash
rm -rf resources/intention/output/*.csv
rm -rf resources/intention/output/*.json
rm -rf .gradle
rm -rf build
rm -f resources/.ready
docker-compose down
