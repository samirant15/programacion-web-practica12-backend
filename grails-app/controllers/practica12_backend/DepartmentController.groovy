package practica12_backend

import com.practica12.Department
import grails.rest.RestfulController

class DepartmentController extends RestfulController {

    DepartmentController() {
        super(Department)
    }

	static responseFormats = ['json', 'xml']
	
    def index() {
        def departments = Department.findAll()

        respond([data: departments])
    }
}
