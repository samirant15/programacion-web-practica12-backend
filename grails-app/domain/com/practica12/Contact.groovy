package com.practica12

class Contact {

    String firstName
    String lastName
    String email
    String phone
    String cellPhone
    String address
    String job

    static belongsTo = Department
    static hasMany = [deparments: Department]

//    static mapping = {
//        deparments joinTable: [name: "department_contact", key: 'contact_id']
//    }
//    String
    static constraints = {
        firstName blank: false
        email blank: false, unique: true
        phone blank: false
        cellPhone blank: false
        address blank: false
        job blank: false
    }
}
