# SpringConfigurationProperties
Spring Boot has one handy feature, binding external properties to a POJO, whose attributes can be validated by Validation JSR303. 

## @ConfigurationProperties

It works the best with a hierarchical property structure that have the same pre-fix. 
It decorates a POJO, which is binded with the properties defined in application.properties.

## Register @ConfigurationProperties POJO

It needs to inform the Spring to pick up the POJO, and instantiate it in the bean factory, and afterwards it can be initialized with the property values.
There are several way to carry out this goal. 

* Decorating the POJO with @Component

* Generating the POJO in a Bean method, which is decorated with a @ConfigurationProperties. 

* Decorating the POJO with @ConfigurationProperties, meanwhile enabling property scanning, but @@ConfigurationPropertiesScan along with @SpringBootApplication.






