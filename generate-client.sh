#!/usr/bin/env bash

# start the soap server first
wsimport -s ./src -p bee.generated.client -B-XautoNameResolution -extension -Xnocompile http://localhost:8080/device?wsdl
