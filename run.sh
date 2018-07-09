mvn -DskipTests package
NAME=target/debug-docker-0.0.1-SNAPSHOT.jar
docker build --build-arg JAR_FILE=$NAME -t spring-app . && docker run -P spring-app