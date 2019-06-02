package practica12_backend

import com.practica12.Authority
import com.practica12.Category
import com.practica12.Contact
import com.practica12.Department

import com.practica12.Help
import com.practica12.User
import com.practica12.UserAuthority

class BootStrap {

    def springSecurityService

    def init = { servletContext ->
        def role1 = new Authority(authority: 'ROLE_USER').save(failOnError: true)
        def user1 = new User(username: 'user1', password: springSecurityService.encodePassword('admin')).save(failOnError: true)
        UserAuthority.create(user1,role1)

        def depart = new Department(name: 'ISC', description: 'Escuela de Ingeniería', user: user1, created_on: new Date()).save(failOnError: true)

        def category = new Category(name: 'profesor', user: user1, created_on: new Date())

        def contact = new Contact(firstName: "asdasdsa", lastName: "lastName",
                email: "juandiii@gmail.com", phone: "phone@gmail.com",
                cellPhone: "cellPhone", address: "callPadre fortin", job: "ISC",
                created_on: new Date(), user: user1, deparments: [depart], category: category).addToDepartments(depart).save(failOnError: true)

        5.times {new Help(help: "sadas ${it+1}", completed: it % 2 == 0).save(failOnError: true) }
    }
    def destroy = {
    }
}
