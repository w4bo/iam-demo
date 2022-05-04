# Intentional Analytics Model

[![build](https://github.com/w4bo/iam-demo/actions/workflows/build.yml/badge.svg?branch=master)](https://github.com/w4bo/iam-demo/actions/workflows/build.yml)

## Running the experiments

This repository allows the user to:
1. download the necessary datasets;
2. bring up a Docker container with Oracle 11g;
3. load the datasets into Oracle;
4. run the tests.

Running the experiments requires the following software to be installed:
- Docker
- Java 14
- Python 3.10.4

Once the software is installed, execute the following code to run the tests.

    cd intentional
    chmod +x *.sh
    ./init.sh
    ./build.sh
    ./download.sh
    ./start.sh
    ./stop.sh
