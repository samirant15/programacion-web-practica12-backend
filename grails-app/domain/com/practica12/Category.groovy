package com.practica12

class Category implements Serializable {

    private static final long serialVersionUID = 1

    String name

    static constraints = {
        name blank: false
    }
}
