package vocab

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class GetInternalAssociatedTerms implements Serializable {

	String uid
	String name
	String type
	String parentUid
	String parentName

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append uid
		builder.append name
		builder.append type
		builder.append parentUid
		builder.append parentName
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append uid, other.uid
		builder.append name, other.name
		builder.append type, other.type
		builder.append parentUid, other.parentUid
		builder.append parentName, other.parentName
		builder.isEquals()
	}

	static mapping = {
		id composite: ["uid", "name", "type", "parentUid", "parentName"]
		version false
	}

	static constraints = {
		uid nullable: true
		name nullable: true
		type nullable: true
		parentUid nullable: true
		parentName nullable: true
	}
}
