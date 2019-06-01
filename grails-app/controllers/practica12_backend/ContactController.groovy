package practica12_backend

import com.practica12.Contact
import grails.rest.*
import grails.converters.*

class ContactController extends RestfulController {

    ContactController() {
        super(Contact)
    }
	static responseFormats = ['json', 'xml']

    def index() {
        def contacts = Contact.findAll()

        respond([data: contacts])
    }

}
