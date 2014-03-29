package grailslab

class Menu {
	
	String nome
	String actionListener
	String url
	String icon
	Integer sequencia
	static belongsTo = [menuPai : Menu]
	
	static mapping = {
		menuPai				lazy: false
	}
	
    static constraints = {
		nome				nullable: true
		actionListener		nullable: true
		url					nullable: true
		icon				nullable: true
		sequencia			nullable: true
		menuPai				nullable: true
    }
	
	public String toString() {
		nome
	}
}
