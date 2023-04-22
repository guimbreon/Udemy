#!/bin/bash

# Project on command substituion

#Calculate time to execute a script

START=$(date +%s)

#HERE IN THE MIDDLE U SHOULD RUN THE FILE U WANT TO RUN ex:
#./batata.py

END=$(date +%s)
TIME_TAKEN=$((END-START))

echo Time taken to execute the script : $TIME_TAKEN
