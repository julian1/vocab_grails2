
-------
Ok, this works
grails console
(new vocab.Organisation(  name: 'whoot', acronym: 'xx' )).save();

ctrl-d 

-------
Need to downgrade hibernate version to do the rev-engineer. 
then upgrade to get it start in console.

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



