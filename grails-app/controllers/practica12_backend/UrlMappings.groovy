package practica12_backend

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        "/api/users/logged"(controller: 'user', action: 'auth')

        "/api/users"(resources: 'user') {
            "/departments"(resources: 'department')
        }
        "/api/departments"(resources: 'department')
        "/api/contacts"(resources: 'contact')
        "/api/categories"(resources: 'category')
        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
        "401"(view: '/notAuth')
    }
}
