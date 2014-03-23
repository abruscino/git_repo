package com.glab

class Perfil {

	static mapping = {table name: "perfil", schema: "grailslab"}
	
	String nome
	Boolean ativo
	static hasMany = [menus : Menu]

    static constraints = {
		nome	size: 5..50, nullable: false, blank: false
		menus	nullable: false, blank: false
    }
	
	public String toString() {
		nome
	}
}
