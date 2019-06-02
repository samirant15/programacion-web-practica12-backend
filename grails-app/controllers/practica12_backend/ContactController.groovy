package practica12_backend

import com.practica12.Category
import com.practica12.Contact
import com.practica12.Department
import com.practica12.User
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

    @Override
    protected Contact createResource() {
        Contact contact = super.createResource()
        if (contact.departments) {
            contact.departments.each {dpt ->
                contact.addToDepartments(dpt)
            }
        }
        contact
    }
}
