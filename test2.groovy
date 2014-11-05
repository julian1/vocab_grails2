

// change works - on fresh db.
rp = vocab.ResponsibleParty.find( "from ResponsibleParty where organisation.acronym = 'eMII' and person.name = 'Mancini, Sebastien'" )
o = vocab.Organisation.find( "from Organisation where acronym = 'AAD'" )
rp.organisation = o
rp.isDirty()
// doens't work? 
rp.save( flush: true, failOnError:true )


// need to change back
o = vocab.Organisation.find( "from Organisation where acronym = 'eMII'" )
rp.organisation = o
rp.save( flush: true, failOnError:true )


