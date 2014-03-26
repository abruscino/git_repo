package grailslab

class Perfil {

	String nome
	
	static hasMany = [menus : Menu]

    static constraints = {
		nome	nullable: true
    }
	
	public String toString() {
		nome
	}
}
