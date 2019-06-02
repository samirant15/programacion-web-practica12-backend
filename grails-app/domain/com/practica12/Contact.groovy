package com.practica12

class Contact {

    String firstName
    String lastName
    String email
    String phone
    String cellPhone
    String address
    String job
    Date created_on;
    User user;
    Category category;

    static belongsTo = [User, Department]
    static hasMany = [departments: Department]

    static constraints = {
        firstName blank: false
        email blank: false, unique: true
        phone blank: false
        cellPhone blank: false
        address blank: false
        job blank: false
        created_on blank: false
        user blank: false
        category blank: false
    }
}
