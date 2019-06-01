package com.practica12

import grails.rest.Resource


//@Resource(uri = '/api/departments')
class Department {

    String name
    String description

    static belongsTo = [user: User]
    static hasMany = [contacts: Contact]

//    static mapping = {
//        contacts joinTable: [name: "department_contact", key: 'department_id']
//    }

    static constraints = {
        name blank: false
        description blank: false
    }
}
