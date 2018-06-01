#!/bin/sh


source conf.sh

export JAVA_OPTIONS='-Xmx300m -Xss512k -Dfile.encoding=UTF-8'

export DATABASE_URL='jdbc:postgresql://localhost:5432/kandidaten?user=kandidaten&password=kandidatenpwd'

export BTW17_JPA_HIBERNATE_DDL_AUTO=update

./mvnw clean spring-boot:run

exit 0
