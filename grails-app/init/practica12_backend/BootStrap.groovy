package practica12_backend

import com.practica12.Authority
import com.practica12.User
import com.practica12.UserAuthority

class BootStrap {

    def init = { servletContext ->
        def role1 = new Authority(authority:"ROLE_USER").save flush:true
        def user1 = new User(username:"user1",password:"pwd1").save flush:true
        UserAuthority.create(user1,role1)
    }
    def destroy = {
    }
}
