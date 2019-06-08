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

[]        respond([data: departments])
    }

    def show(Department department) {

        if (department == null) {
            response.setStatus(404)
            respond([data: null, code: response.status, message: 'Department not found.'])
            return
        }

       def getDepartment = Department.findById(department.id)

        respond([data: getDepartment])
    }
}
