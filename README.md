# SpringConfigurationProperties
Spring Boot has one handy feature, binding external properties to a POJO, whose attributes can be validated by Validation JSR303. 

## @ConfigurationProperties

It works the best with a hierarchical property structure that have the same pre-fix. 
It decorates a POJO, which is bind with the properties defined in application.properties.

## Register @ConfigurationProperties POJO

It needs to inform the Spring to pick up the POJO, and within the bean factory to instantiate it, and initializing it with the property values.
There are several way to carry out this goal. 

* Decorating the POJO with @Component; IOC do the property binding within the bean factory

* Using bean method, decorated with a @ConfigurationProperties, meaning that this bean is bind with the property file. 

* Decorating the POJO with @ConfigurationProperties, meanwhile enabling property scanning, by @EnableConfigurationProperties 
and @ConfigurationPropertiesScan along with @SpringBootApplication.






