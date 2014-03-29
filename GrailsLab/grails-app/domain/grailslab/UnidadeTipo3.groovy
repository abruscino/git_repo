package grailslab

class UnidadeTipo3 {

	String nome
	static belongsTo = [uoii: UnidadeTipo2]
	
	static mapping = {
		uoii	lazy: false
	}

    static constraints = {
		nome	nullable: true
    }
	
	public String toString() {
		nome
	}
}
