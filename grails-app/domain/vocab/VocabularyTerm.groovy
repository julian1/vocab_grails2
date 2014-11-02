package vocab

class VocabularyTerm {

	String name
	String uid
	String shortName
	String ancillaryInformation
	String definition
	String alternativeTermExpression
	Date dateAdded
	String proposalTermStatus
	String termStatus
	Date dateStatusAmended
	String termNotes
	VocabularyRegister vocabularyRegister
	ReferenceSource referenceSource
	VocabularyType vocabularyType
	ResponsibleParty responsibleParty
	Person person

	static hasMany = [amendments: Amendment,
	                  externalAssociatedTermses: ExternalAssociatedTerms,
	                  internalAssociatedTermsesForObjectVocabularyTermId: InternalAssociatedTerms,
	                  internalAssociatedTermsesForSubjectVocabularyTermId: InternalAssociatedTerms,
	                  termCategoryClassifications: TermCategoryClassification]
	static belongsTo = [Person, ReferenceSource, ResponsibleParty, VocabularyRegister, VocabularyType]

	// TODO you have multiple hasMany references for class(es) [InternalAssociatedTerms] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [internalAssociatedTermsesForObjectVocabularyTermId: "TODO",
	                   internalAssociatedTermsesForSubjectVocabularyTermId: "TODO"]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		name maxSize: 110, unique: true
		uid maxSize: 110, unique: true
		shortName nullable: true, maxSize: 110
		ancillaryInformation nullable: true, maxSize: 110
		definition nullable: true, maxSize: 4000
		alternativeTermExpression nullable: true, maxSize: 110
		dateAdded nullable: true
		proposalTermStatus nullable: true, maxSize: 20
		termStatus nullable: true, maxSize: 20
		dateStatusAmended nullable: true
		termNotes nullable: true, maxSize: 1010
	}
}
