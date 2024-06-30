package com.user.model;

public interface BikeDetails {
  void nameOfTheBike();
  void ccOfTheBike();
  void colorOfTheBike();
}
/*
 * @AutoWired Annotation is used to perform the dependency injection automatically
 * ->It is having the ACCESS nothing but it can be placed above the field,method
 * Constructor Parameter Annotation
 * ->If @AutoWired Annotation is placed above the field directly IOC Container inject
 * the object into the non-primitive data type
 * ->If @AutoWired Annotation is placed above the setters it is going to choose setter way of injection
 * ->If @AutoWire Annotation is placed above the constructor it is going to choose constructor way of injection.
 * ->If we place the @AutoWired Annotation above the constructor the constructor should be argumented as
 * Non-Primitive data type only.
 * ->To specify the annotation configuration to IOC Container we make use of the tag
 * <context:annotation-config/>in xml file
 * ->If IOC container founds more than one bean of the classes which is annoted as @AutoWired IOC
 * container throws the exception
 * ->to give confirmation to the IOC container which bean has to be injected into the class by using
 *  @Qualifier Annotation
 * ->@Qualifier Annotation it is one of the argument annotation.Give the argument as bean reference variable
 * Syntax:- @Qualifier("reference variable of bean")
 * It is having the access of nothing but in can be placed above the filed,method parameter annotation
 * @Value annotation is used to pass the values to the primitive datatypes
 * ->It is one of the argumented annotation we have to pass the value as the argument to the annotation
 * Syntax:-@Value("required resource of value")
 * It is having the method access field access parameter access and annotation 
 * if the annotation is placed above the setter method it takes the setter way  of injection
 * if it placed above the constructor the constructor is going to take the constructor way of injection
 * if it is placed above the variable the value will be injected directly into the variable.
 * 
 * @Component Annotation is used to create the bean of the class
 * ->this annotation comes under the stereotype Annotation
 * ->the annotation which are used for the creation of bean of the classes are called as
 * Stereotype Annotation.
 * ->to show the path of the component classes by using xml configuration
 * we need to use the tag called as
 * <context:component-scan base-package="package name"/>
 * ->After creation of the bean it will use the class name for bean reference 
 * variable in camel casing ex:class Employee r.f of the bean is employee.
 * Ex:2 class EmployeeDEtails r.f of the bean is employeedetails
 * 
 * to know the bean reference variable present in IOC container we make use of the method getBeanDefinationName()
 * 
 * the return type of the method id String[];
 */