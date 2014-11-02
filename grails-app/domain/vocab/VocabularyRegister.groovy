package vocab

class VocabularyRegister {

	String uid
	String name
	String contentSummary
	String languageName
	String languageCode
	String languageCountry
	String languageEncoding
	Date date
	Date dateOfLastChange
	ResponsibleParty responsiblePartyByOwnerResponsiblePartyId
	ResponsibleParty responsiblePartyByManagerResponsiblePartyId

	static hasMany = [amendments: Amendment,
	                  vocabularyTerms: VocabularyTerm]
	static belongsTo = [ResponsibleParty]

	static mapping = {
		id generator: "assigned"
	}

	static constraints = {
		uid maxSize: 1010, unique: true
		name maxSize: 110, unique: true
		contentSummary nullable: true, maxSize: 1010
		languageName nullable: true, maxSize: 50
		languageCode nullable: true, maxSize: 10
		languageCountry nullable: true, maxSize: 10
		languageEncoding nullable: true, maxSize: 50
		date nullable: true
		dateOfLastChange nullable: true
	}
}
