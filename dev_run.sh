mvn clean install -N
mvn clean install -Dmaven.test.skip=true
cd ubw-web
mvn jetty:run