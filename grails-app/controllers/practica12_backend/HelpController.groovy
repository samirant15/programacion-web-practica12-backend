package practica12_backend

import com.practica12.Help
import grails.rest.*
import grails.converters.*

class HelpController extends RestfulController {

    HelpController() {
        super(Help)
    }
	static responseFormats = ['json', 'xml']
	
    def index() {
        def i = Help.findAllByCompleted(false)

        render i as JSON
    }
}
