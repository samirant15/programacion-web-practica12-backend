package practica12_backend

import com.practica12.Category
import grails.rest.*
import grails.converters.*

class CategoryController extends RestfulController{
	static responseFormats = ['json', 'xml']

    CategoryController(){
        super(Category)
    }
}
