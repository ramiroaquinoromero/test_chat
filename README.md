# Test for Java Simple Chat with SpringBoot and Java 8

Requirements

Use Cases
● As a user I should be able to send a message to another user
Currently exist a endpoint for create a new message and on the database we have a status("Read, Send, Deliver, Deleted")
● As a user I should be able to read incoming messages
Currently we modify the status of messages.
● As a user I can mark my messages as read
Currently we modify the status of messages.
● As a user I can delete my messages
Currently we modify the status of messages.

Non-Functional Requirements
● The application should be horizontally scalable
For this point we could use a microservices o a third part service with load balancer.
● The application should be able to run on containers
Currently exists a Dockerfile.
● The application should be secure
In this case I implemented Oauth2, Exists another libraries like JWT, but only I implemented Ouath2 with the basic modules.
● You can use open source components for implementing any of the use cases which are
not mentioned in the list of use cases above
