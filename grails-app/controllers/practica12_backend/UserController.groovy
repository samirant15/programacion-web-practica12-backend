package practica12_backend

import com.practica12.User
import grails.rest.RestfulController


class UserController extends RestfulController {
//
    UserController() {
        super(User)
    }

	static responseFormats = ['json', 'xml']

//    def index() {
//        def user = User.findAll()
//
//        respond([data: user])
//    }
}
