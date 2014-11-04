package vocab

class VocabularyType {

	String name
	String definition

	static hasMany = [vocabularyTerms: VocabularyTerm]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		name maxSize: 20
		definition nullable: true, maxSize: 1010
	}
}
