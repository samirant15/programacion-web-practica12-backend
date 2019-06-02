package com.practica12

import grails.rest.Resource


//@Resource(uri = '/api/departments')
class Department {

    String name
    String description
    Date created_on;

    static belongsTo = [user: User]
    static hasMany = [contacts: Contact]

    static constraints = {
        name blank: false
        description blank: false
        created_on blank: false
    }
}
