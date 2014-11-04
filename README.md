
Register now works
groovy:000> r = vocab.VocabularyRegister.get(1)
===> vocab.VocabularyRegister : 1
groovy:000> r.uid
===> http://vocab.aodn.org.au/def/parameter
groovy:000> r._version
===> http://vocab.aodn.org.au/def/parameter/version1.0                                                             
groovy:000> r.managerResponsibleParty.person.name
===> Mancini, Sebastien
groovy:000> 



fails.

Either, 
 grails run-script test.groovy
 grails shell


this_.responsible_party_by_manager_responsible_party_id_id


ORM - reverse engineer,
	- sequences - hibernate wants own single sequence
	- missing foreign key constraints
	- version field. 
	- gorm dynamic typing bugs.

-----

groovy:000> vt = vocab.VocabularyTerm.get(1 );
===> vocab.VocabularyTerm : 1
groovy:000> vt.proposerResponsibleParty.person.name
===> Mancini, Sebastien
groovy:000> vt.vocabularyType.name
===> Instrument

-------

v = vocab.VocabularyType.get( 'Parameter' ) ;
worked.


v = vocab.VocabularyType.get(1)

Fails,
rs = vocab.VocabularyRegister.get( 1);
vt = vocab.VocabularyTerm.get(1 );

This works - now

vt = vocab.VocabularyTerm.get(1 );
vt.proposerResponsibleParty.person.name

----
Note, how we can drill down the terms,

groovy:000> rp = vocab.ResponsibleParty.get( 1); 
groovy:000> rp.person.name




works
vocab.Organisation.list() ;
vocab.ResponsibleParty.list();
def o = vocab.Organisation.get(1) ;

groovy:000> o = vocab.Organisation.get(1) ;
===> vocab.Organisation : 1
groovy:000> o.name
===> Integrated Marine Observing System




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



