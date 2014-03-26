package grailslab

class UnidadeTipo1 {

	String nome

    static constraints = {
		nome nullable: true
    }
	
	public String toString() {
		nome
	}
}
