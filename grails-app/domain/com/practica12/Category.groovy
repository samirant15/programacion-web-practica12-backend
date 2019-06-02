package com.practica12

class Category implements Serializable {

    private static final long serialVersionUID = 1

    String name
    Date created_on;
    User user;

    static belongsTo = [User, Contact]

    static constraints = {
        name blank: false
        created_on blank: false
        user blank: false
    }
}
