package vocab

class ResponsibleParty {

	AffiliationType affiliationType
	Person person
	Organisation organisation

	static hasMany = [amendments: Amendment,
	                  classificationSchemes: ClassificationScheme,
	                  vocabularyRegistersForManagerResponsiblePartyId: VocabularyRegister,
	                  vocabularyRegistersForOwnerResponsiblePartyId: VocabularyRegister,
	                  vocabularyTerms: VocabularyTerm]
	static belongsTo = [AffiliationType, Organisation, Person]

	// TODO you have multiple hasMany references for class(es) [VocabularyRegister] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
    static mappedBy = [vocabularyRegistersForManagerResponsiblePartyId: "responsiblePartyByManagerResponsiblePartyId",
                          vocabularyRegistersForOwnerResponsiblePartyId: "responsiblePartyByOwnerResponsiblePartyId"]


	static mapping = {
		id generator: "assigned"
		version false
	}
}
