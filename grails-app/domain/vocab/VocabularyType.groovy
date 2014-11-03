package vocab

class VocabularyType {

	String id
	String name
	String definition

	static hasMany = [vocabularyTerms: VocabularyTerm]

		
	static mapping = {
		//id name: "name", generator: "assigned", type: 'text'
		//name name: "name", generator: "assigned"
		//id name: 'name', generator: "assigned"
		//id column: 'name', type: 'text', insert: "false", update: "false" 

		//id name: 'name', column: 'name', generator: "assigned"

		//id name: "name", column: 'name', generator: "assigned", type: 'text'

	
//		table 'vocabulary_type'
//		version false
//		id column: 'name', generator: "assigned"

		table 'vocabulary_type'

		version false

		
		id name: "name", column: "name", generator: "assigned", type: 'string'

        columns {
            name column: 'name', type: 'string'
        } 
	}

	static constraints = {
		name maxSize: 20
		definition nullable: true, maxSize: 1010
	}
}
