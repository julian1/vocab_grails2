package vocab

class ClassificationSchemeAssociation {

	ClassificationSchemeCategory classificationSchemeCategoryByClassificationSchemeCategoryId
	ClassificationSchemeCategory classificationSchemeCategoryByParentClassificationSchemeCategoryId

	static belongsTo = [ClassificationSchemeCategory]

	static mapping = {
		id generator: "assigned"
		version false
	}
}
