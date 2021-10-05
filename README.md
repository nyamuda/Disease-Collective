# Disease-Collective
A Restful API that for all diseases. It provides the causes and ways the disease can be treated naturally.


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
If you just want to play around with the the API, use the url: https://diseasecollective.herokuapp.com/</br>

<p>To set up the application, clone the repository, then run</p>
<div>
 <ol>
 <li>Install the dependencies: <code>mvn clean install</code></li>
  <li>Run the Spring Boot app <code>mvn spring-boot:run</code></li>
 <ol>
</div>
<h3>Tech/Framework used</h2>
   <p>Java, Spring Boot, Hibernate & MySQL.</p>
  
  <h2>Database</h2>
  <div><p>The structure of the database is as follows:</p>
<image src="https://github.com/pnyamuda/Data-Engineering-University-Courses/blob/master/diseases-database.png?raw=true"></div>
 
<h3>How to Use?</h3>
   <p>Currently the API has only 3 endpoints</p>
  
   <p>Get disease by id: <code>/api/disease/{id}</code></p>
   
   
   <p>Get all the diseases:  <code>/api/diseases</code></p>
   
  <p>Search for a disease: <code>/api/diseases/{name}</code></p>
   
  

