#!/usr/bin/env bash

wsimport -s ./src -p bee.generated.server -B-XautoNameResolution -extension -keep -Xnocompile wsdl/device-binding.xml
