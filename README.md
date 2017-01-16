# Jersey-Spring-Hibernate-Project
This project will help you to give a kick start to your Project using Jersey 2.25, Spring 4.3.5 RELEASE, Hibernate 5.5.6 Final

to check its working condition go to http://localhost:8080/JerseySpringHibernate/webapi/myresource

FOR THE (POST & PUT) you need to pass the data in json.
{
  "city": "Gangtok",
  "firstName": "Updated",
  "lastName": "Name",
  "pin": 737101,
  "state": "Sikkim",
  "street": "sisa golai"
}

To get All Customers (http GET request) http://localhost:8080/JerseySpringHibernate/webapi/customers
to get customer with id 1 (http GET request) http://localhost:8080/JerseySpringHibernate/webapi/customers/1
to save customer data (http POST request) http://localhost:8080/JerseySpringHibernate/webapi/customers
to update customer with id 1 (http PUT request) http://localhost:8080/JerseySpringHibernate/webapi/customers/1
to delete customer with id 1 (http DELETE request) http://localhost:8080/JerseySpringHibernate/webapi/cusomters/1
