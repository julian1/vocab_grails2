package vocab

class InternalAssociatedTerms {

	VocabularyTerm vocabularyTermByObjectVocabularyTermId
	AssociationType associationType
	VocabularyTerm vocabularyTermBySubjectVocabularyTermId

	static belongsTo = [AssociationType, VocabularyTerm]

	static mapping = {
		id generator: "assigned"
		version false
	}
}
