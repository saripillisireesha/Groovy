package example.micronaut.gorm.domain

import grails.gorm.annotation.Entity
import org.springframework.cglib.core.KeyFactory



@Entity
class ComanyDomain {
    String name
    String email
    String password
static mapping={
    id generator:'increment'
    password column:"pwd"
}
    static constraints={
        name blank:false ,nullable:false
        email blank:false, nullable:false

    }
}
