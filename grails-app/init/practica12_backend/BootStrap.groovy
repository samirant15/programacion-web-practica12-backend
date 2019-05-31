package practica12_backend

import com.practica12.Authority
import com.practica12.Department

import com.practica12.Help
import com.practica12.User
import com.practica12.UserAuthority

class BootStrap {

    def springSecurityService

    def init = { servletContext ->
        def depart = new Department(name: 'ISC', description: 'Escuela de Ingeniería')
        def role1 = new Authority(authority: 'ROLE_USER').save()
        def user1 = new User(username: 'user1', password: springSecurityService.encodePassword('admin')).addToDepartment(depart).save()
        UserAuthority.create(user1,role1)

        5.times {new Help(help: "sadas ${it+1}", completed: it % 2 == 0).save() }
    }
    def destroy = {
    }
}
