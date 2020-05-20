#!bin/bash
awk 'BEGIN { for (i=1; i<=10; ++i) printf "ektha%s,Solutions,10/12/2012,1455,Meadowland,Irving,72032\n",i}' > /data/output.txt && \
java -Ddatafilepath=/data/output.txt -jar app.jar