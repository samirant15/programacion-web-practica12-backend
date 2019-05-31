package practica12_backend

import com.practica12.Department

class DepartmentController {
	static responseFormats = ['json', 'xml']
	
    def index() {
        def departmanets = Department.findAll()

        respond([data: departmanets])
    }
}
