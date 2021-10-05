# Disease-Collective
A Restful API that for all diseases. It provides the cause and ways the disease can be cured naturally.


# JAVA-SPRING-BOOT-RESTful-API
A RESTful API for A 'Level physics and chemistry students. It provides the exam definitions of physics and chemistry terms required by the curriculum (Cambridge/CAPS).

<h2>Motivation</h2>
<p>"Health is a great treasure. It is the richest possession that mortals can have. Wealth, honor, or learning
is dearly purchased, if it be at the loss of the vigor of health. None of these attainments can secure
happiness if health is wanting."— Education, 35.</p>
<p>
To to teach people the basic principles of right living, to ensure the best health they can have with the limitations
imposed by the body they have. To keep this living machinery in healthful action and to provide various ways sickness can be
avoided and the natural ways it can be treated is the aim of this API. It provides information of over 1000 diseases, their causes, symptoms, risk factors and treatment using natural remedies and medication. 
</p>
<p>The information the API provides is not intended to diagnose medical problems, prescribe remedies for illness, or treat disease. 
It's intention is solely educational.</p>
<h2>Build Status</h2>
More information about is diseases is still being added.

<h2>How to set it up</h2>
If you just want to play around with the the API, use the url:https://scienceterms.herokuapp.com</br>

To set up the application, clone the repository, then run
<ol>
 <li>Install the dependencies: <code>mvn clean install</code></li>
  <li>Run the Spring Boot app <code>mvn spring-boot:run</code></li>
 <ol>

<h2>Database</h2>
The structure of the database is as follows:
<image src="https://github.com/pnyamuda/Data-Engineering-University-Courses/blob/master/sciencetermsdatabase.png?raw=true">

<h2>Tech/Framework used</h2>
Java, Spring Boot, Hibernate & MySQL.
The API uses JSON Web Tokens for authentication and authorization.

<h2>How to Use?</h2>
 Register:</br>
 <code>/user/save</code></br>
 Login:</br>
 <code>/login</code></br>
To use the API, the user needs register first and the following fields are required:</br>
<code>
{
username:””,
password:””, 
firstName:””,
secondName:””,
curriculum:{
  id:""
  }
}
