
-------
Ok, this works
grails console
(new vocab.Organisation(  name: 'whoot', acronym: 'xx' )).save();

ctrl-d 

-------

build.sh

----
grails 2.4.4

grails create-app vocab
git init

git add $( find -type f | grep -v git  )
g cm 'initial'

g a .gitignore
etc.



