package com.glab

class Menu {

	static mapping = {table name: "menu", schema: "grailslab"}
	
	String nome
	String actionListener
	String icon
	Menu pai
	Integer ordem

    static constraints = {
		nome				size: 5..50, blank: false, nullable: false
		actionListener		size: 4..30, blank: true, nullable: true
		icon				size: 5..50, blank: false, nullable: false
		ordem				blank: false, nullable: false
    }
	
	public String toString() {
		nome
	}
}
