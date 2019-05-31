package practica12_backend

import com.practica12.Help

import grails.rest.*

class HelpController extends RestfulController {

    HelpController() {
        super(Help)
    }
	static responseFormats = ['json', 'xml']
	
    def index() {
        def i = Help.findAllByCompleted(true)

        respond([message: "OK", status: response.status, data: i])
    }
}
