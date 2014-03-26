package grailslab

class Menu {
	
	String nome
	String actionListener
	String url
	String icon
	Integer sequencia
	Menu pai
	
    static constraints = {
		nome				nullable: true
		actionListener		nullable: true
		url					nullable: true
		icon				nullable: true
		sequencia			nullable: true
		pai					nullable: true
    }
	
	public String toString() {
		nome
	}
}
