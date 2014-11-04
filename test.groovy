
println vocab.Organisation.list().name
println vocab.Organisation.get(1).name

println vocab.Person.list().name
println vocab.Person.get(1).name

println vocab.AffiliationType.list().name
println vocab.AffiliationType.get(1).name

// note, table is empty
println vocab.OrganisationSynonym.list().name

println vocab.ReferenceSource.list().citationString
println vocab.ReferenceSource.get(1).citationString

println vocab.ResponsibleParty.list().person.name
println vocab.ResponsibleParty.get(1).person.name

println vocab.ClassificationScheme.list().name
println vocab.ClassificationScheme.get(1).name

println vocab.VocabularyRegister.list().uid 
println vocab.VocabularyRegister.get( 1).uid
println vocab.VocabularyRegister.get( 1).managerResponsibleParty.person.name

println vocab.VocabularyType.list().name
println vocab.VocabularyType.get(1).name

vt = vocab.VocabularyTerm.get(1 );
println vt.uid
println vt.vocabularyType.name
println vt.proposerResponsibleParty.person.name
println vt.proposerResponsibleParty.organisation.name


println vocab.AssociationType.get(1).name
println vocab.AssociationType.list().name
