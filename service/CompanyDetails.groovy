package example.micronaut.gorm.service

import example.micronaut.gorm.domain.ComanyDomain
import example.micronaut.gorm.model.CompanyEntity
import example.micronaut.gorm.model.Person
import grails.gorm.transactions.Transactional

import javax.inject.Singleton

@Singleton
class CompanyDetails {
    @Transactional
    def saveCompany(CompanyEntity companyEntity) {
        ComanyDomain p = new ComanyDomain()
        p.name=companyEntity.name
        p.email=companyEntity.email
        p.password=companyEntity.password
        p.save()
    }

}
