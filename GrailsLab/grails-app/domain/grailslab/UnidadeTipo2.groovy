package grailslab

class UnidadeTipo2 {

	String nome
	UnidadeTipo1 uoi

    static constraints = {
		nullable: true
    }
	
	public String toString() {
		nome
	}
}
