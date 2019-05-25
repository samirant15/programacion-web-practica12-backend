package practica12_backend

import com.practica12.Authority
import com.practica12.User
import com.practica12.UserAuthority

class BootStrap {

    def init = { servletContext ->
        def role1 = new Authority(authority:"ROLE_USER").save()
        def user1 = new User(username:"user1", password: "admin").save()
        UserAuthority.create(user1,role1)
    }
    def destroy = {
    }
}
