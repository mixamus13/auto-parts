# Maven Version
MV=3.6.3

run:
	./mvnw spring-boot:run -Dspring.profiles.active=local

update:
	./mvnw versions:update-parent versions:update-properties versions:display-plugin-updates

init:
	git init
	touch .git/info/exclude
#  maven-wrapper
	mvn -N io.takari:maven:wrapper -Dmaven=$(MV)
	rm mvnw.cmd
	chmod +x ./mvnw
	echo "\n/.mvn\n/mvnw*\n" >> .git/info/exclude
#  jenv
	jenv local $(J)
	echo "\n/.java-version\n" >> .git/info/exclude
#  checkstyler
#  There is a problem with it. See: https://stackoverflow.com/questions/57723278/maven-checkstyle-plugin-does-not-execute-on-custom-rules
#  curl -O https://raw.githubusercontent.com/checkstyle/checkstyle/master/src/main/resources/google_checks.xml
	curl -O https://raw.githubusercontent.com/checkstyle/checkstyle/checkstyle-8.12/src/main/resources/google_checks.xml
	echo "\n/google_checks.xml\n" >> .git/info/exclude