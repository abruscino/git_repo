package grailslab

class UnidadeTipo2 {

	String nome
	static belongsTo = [uoi: UnidadeTipo1]
	
	static mapping = {
		uoi		lazy: false	
	}

    static constraints = {
		nome	nullable: true
    }
	
	public String toString() {
		nome
	}
}
