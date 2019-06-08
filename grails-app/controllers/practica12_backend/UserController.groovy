package practica12_backend

import com.practica12.User
import grails.rest.RestfulController


class UserController extends RestfulController {
    def springSecurityService

//
    UserController() {
        super(User)
    }

	static responseFormats = ['json', 'xml']

    def index() {
        def user = User.findAll()

        respond([data: user])
    }

    def auth() {
        def user = springSecurityService.currentUser


        respond([data: user])
    }


}
