# SpringConfigurationProperties
Spring Boot has one handy feature, binding external properties to a POJO, whose attributes can be validated by Validation JSR303. 

## @ConfigurationProperties

It works the best with a hierarchical property structure that have the same pre-fix. 
It decorates a POJO, which is bind with the properties defined in application.properties.

## Register @ConfigurationProperties POJO

It needs to inform the Spring IOC to pick up the POJO, and afterwards it can be initialized with the property values.
There are several way to carry out this goal. 

* Decorating the POJO with @Component; this is the most simple way, Spring will do the binding within IOC.

* Using bean method, decorated with a @ConfigurationProperties. 

* Decorating the POJO with @ConfigurationProperties, meanwhile enabling property scanning, by @ConfigurationPropertiesScan 
and @EnableConfigurationProperties along with @SpringBootApplication.






