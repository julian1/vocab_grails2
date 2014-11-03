package vocab

class ClassificationSchemeCategory {

	String name
	String description
	String label
	Date dateAdded
	ClassificationScheme classificationScheme

	static hasMany = [classificationSchemeAssociationsForClassificationSchemeCategoryId: ClassificationSchemeAssociation,
	                  classificationSchemeAssociationsForParentClassificationSchemeCategoryId: ClassificationSchemeAssociation,
	                  termCategoryClassifications: TermCategoryClassification]
	static belongsTo = [ClassificationScheme]

	// TODO you have multiple hasMany references for class(es) [ClassificationSchemeAssociation] 
	//      so you'll need to disambiguate them with the 'mappedBy' property:
	static mappedBy = [classificationSchemeAssociationsForClassificationSchemeCategoryId: "classificationSchemeCategoryByClassificationSchemeCategoryId",
	                   classificationSchemeAssociationsForParentClassificationSchemeCategoryId: "classificationSchemeCategoryByParentClassificationSchemeCategoryId"]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true, maxSize: 1010
		description nullable: true, maxSize: 1010
		label nullable: true, maxSize: 1010
		dateAdded nullable: true
	}
}
