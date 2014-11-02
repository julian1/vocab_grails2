set -x

grails clean 
rm grails-app/domain/vocab/ -rf
grails compile
grails db-reverse-engineer


grails compile
