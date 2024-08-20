package example.micronaut.gorm.controller

import example.micronaut.gorm.model.CompanyEntity
import example.micronaut.gorm.service.CompanyDetails
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

import javax.inject.Inject

@Controller("/company")
class CompanyController {
    @Inject
    CompanyDetails companyDetails
    @Post
    def saveCompany(@Body CompanyEntity companyEntity){
        companyDetails.saveCompany(companyEntity)
        return "successfully"
    }
}
