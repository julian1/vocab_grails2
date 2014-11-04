
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
r = vocab.VocabularyRegister.get( 1)
println r.uid
println r.managerResponsibleParty.person.name
println r.ownerResponsibleParty.organisation.name

println vocab.VocabularyType.list().name
println vocab.VocabularyType.get(1).name

vt = vocab.VocabularyTerm.get(1 );
println vt.uid
println vt.vocabularyType.name
println vt.proposerResponsibleParty.person.name
println vt.proposerResponsibleParty.organisation.name


println vocab.AssociationType.get(1).name
println vocab.AssociationType.list().name

println vocab.Amendment.list().type
a = vocab.Amendment.get(1)
println a.type
println a.vocabularyTerm.uid
println a.vocabularyTerm.vocabularyRegister.uid


iat = vocab.InternalAssociatedTerms.get(1)
println iat.objectVocabularyTerm.uid
println iat.subjectVocabularyTerm.uid
println iat.associationType.name



