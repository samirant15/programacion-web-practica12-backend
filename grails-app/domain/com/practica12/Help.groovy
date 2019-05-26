package com.practica12

import grails.rest.Resource

@Resource(uri = '/api/help')
class Help {

    String help
    boolean completed;

    static constraints = {
    }
}
