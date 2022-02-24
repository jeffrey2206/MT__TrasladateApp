
Software Requirements Specification
for
Transport Public in Quito
Version 1.0 approved
Prepared by 
VICTOR ESPEJO                                                                                                        
CARLOS GRANDA                                                                                                    
JOSE IMBAQUINGA                                                                                                  
MATEO LLUMIGUSIN                                                                                          
JEFFREY MANOBANDA


Quito December 9, 2021  
Table of Contents
Table of Contents	
Revision History	
1.	Introduction	
     1.1Purpose	
1.2	Document Conventions	
1.3	Intended Audience and Reading Suggestions	
1.4	Product Scope	
1.5	References	
2.	Overall Description	
2.1	Product Perspective	
2.2	Product Functions	
2.3	User Classes and Characteristics	
2.4	Operating Environment	
2.5	Design and Implementation Constraints	
2.6	Assumptions and Dependencies	
3.	External Interface Requirements	
3.1	User Interfaces	
3.2	Hardware Interfaces	
3.3	Software Interfaces	
4.	System Features	
4.1	System Feature 1	
4.2	System Feature 2 (and so on)	
5.	Other Nonfunctional Requirements	
5.1	Performance Requirements	
5.2	Safety Requirements	
5.3	Security Requirements	
5.4	Software Quality Attributes	
5.5	Business Rules	
6.	Other Requirements	
Appendix A: Glossary
Appendix B	



Revision History
Name	Date	Reason For Changes	Version
VICTOR ESPEJO                                                                                                                                                                                                                                                                                                                                                                                                  	9/12/2021		V. 1.0
CARLOS GRANDA	9/12/2021		V. 1.0
JOSE IMBAQUINGA  	9/12/2021		V. 1.0
MATEO LLUMIGUSIN   	9/12/2021		V. 1.0
JEFFREY MANOBANDA	9/12/2021		V. 1.0


 
1.	Introduction
This document is a Software Requirements Specification (SRS) for transport Public in Quito. This specification has been structured based on the guidelines given by the IEEE Recommended Practice for Software Requirements Specifications ANSI / IEEE 830, 1998.
1.1	Purpose 
The purpose of this document is to define the functional and non-functional specifications of the public transport public in Quito. This will be used by pedestrians and drivers

1.2	Document Conventions
This specification of requirements is addressed to the user of the program, to continue with the development of the public transport in Quito program to deepen the automation of this. Its main objective is to make known the main fastest routes to users
1.3	Intended Audience and Reading Suggestions
This document is intended for the following people: developers, programmers, clients, administrative staff, document writers, evaluators, project managers.
1.4	Product Scope	
Mainly to people who want to move around Quito and do not know the routes, as well as for people who know the route but want to know a more efficient way to get around the streets of Quito. The benefits are that users will be able to get to their destinations faster and without getting lost. The objective is to help the people of Quito to be able to mobilize in a more efficient way regardless of whether they know the route or not.
1.5	References

Title of the Document	Reference
Standard IEEE 830 - 1998	IEEE 

2.	Overall Description
2.1	Product Perspective
This system is a product designed to work on different types of routes and specifications of cooperatives, used by public transport cooperatives and normal users because this can facilitate their work and make picking routes of higher quality and bring a better order in the periodic work.
2.2	Product Functions
 
2.3	User Classes and Characteristics
-	Type of work user
 job training
Actively participate in updating routes and transport cooperatives
-	User type Provider
NA job training
Make observations and consult information


2.4	Operating Environment
This application could be downloaded through the app store and the play store so that it can be operated on android it should have a version greater than 5.1 and in IOS a version greater than 7.1 so that errors do not happen, apart from that it should have minimum 1GB ram memory, this application will use at least 50MB of internal storage.
2.5	Design and Implementation Constraints
Some elements or problems that limit the creation options are lack of time requirements, lack of memory requirements, lack of money, lack of tools, and lack of support from any investor.
2.6	Assumptions and Dependencies
• The requirements described here are assumed to be stable.
• The computer on which the system is going to be run must comply with the requirements indicated above to ensure the correct execution of the system, in addition to the fact that some legal problems may arise at future times.
3.	External Interface Requirements
Functional Requirements
Identification	Description	Priority
FR01	Ask for login data or in case you do not have them, an account is created where an email and password are requested, later a subscription either free or paid depending on the services required.	High
FR02	You must have a valid e-mail address. If you cannot verify your email address, you will not be able to continue with the registration process.	High
FR03	A secure password that meets the requirements of having more than eight characters and at least one number and/or symbol.	High
FR04	A valid form of payment for the paid subscription. If you do not have it or if it is incorrect, you will not be able to access the full functionality.	High
FR05	Internet connection, if not available, the application cannot be used.	High
 
Non-Functional Requirements
Identification	Description	Priority
NFR01	Guarantee the reliability, security and performance of the application to the different users.   In this sense, the information stored or records made may be consulted and updated whenever the user wishes.	High
NFR02	The system must have a user-friendly and easy-to-use interface.	High
NFR03	The system must be available with a service level for users of 7 days per 24 hours.	High
NFR04	The application should be complemented with a good initial help system in case any user does not know the application.	High
NFR05	The application will be designed for apple and android.	High

3.1	User Interfaces
The user interface will be simple and consistent, using common terms understood by system users. The system will have a simple interface, consistent with standard system interfaces, and will not require training for infrequent users. The Transladate application will evaluate the user interface of similar systems and apply it appropriately. User testing will be used to ensure that the user interface is clear (simple vocabulary, understandable, intuitive to use without training), complete (users can perform all functions from the interface) and consistent (buttons, wording is the same throughout the system).
3.2	Hardware Interfaces
No additional hardware interfaces are required. We can have the general network, server connection, hosting site and network servers. The system will also include a warning message when a low baud rate is detected and a low GUI option will be available.
3.3	Software Interfaces
The system will use software resources such as Java Scripts, HTML, CSS, PHP, MySQL server, C++, Maps and also if there is another necessary resource needed by the system, this should be included when it is being developed.
4.	System Features
This software will allow all public transport cooperatives to offer their timetable routes, basically all the information necessary for the user to access it in a very simple way. With all this information provided, the software will be able to fulfill its main function, which is to provide the user with a route to reach a certain destination. Through the GPS location it will provide you with where the closest stop to your home is, how many buses you should take, what is the approximate arrival time depending on traffic, weather, rush hour and in turn it will show an approximate rate of the cost of the trip .
4.1	System Feature 1
Provide the user with all the information necessary to reach their destination.
4.1.1	Description and Priority
It provides the route that the user must follow, this being of high priority since it is the main information that the user will need throughout their journey. The situation of the company is classified as eight, the penalty for workers who affect the company is five And the risk that may exist in this project is that the software provides wrong information and the user cannot define their route or arrive to your destination (Which is unlikely).

4.1.2	Stimulus/Response Sequences
Enter the destination -> Enter the starting point - search - show the results and select the route to follow - start the journey.
4.1.3	Functional Requirements
If in some hypothetical case the application generates an error or several errors in turn. The procedure to follow would be the following.

R1. If for some strange reason the software generates an error causing the generated path to be incorrect and cannot be used. What should be done immediately would be to make a complete review of the code and especially the process of generating the route, to identify the possible code error, and thus make a quick and efficient solution to correct that failure.

R2. Another possible error would be that the software cannot identify the departure and destination locations, generating that the route cannot be given or all the corresponding information on it, which would be the approximate time of arrival, estimated rate, cooperatives to use, among other things. If this situation were to happen we would have to check that Google Maps is working well together with our software and how the information about the starting and ending points is, the generation of the route works together with Google Maps, which contains all this information from all cities. For this reason, great care should be taken that the software is correctly linked to the Google Maps servers and can be used correctly and does not generate any type of error.
4.1.3 Functional Requirements

Use case name:	The user may enter the system by creating an account, it may be through a Google, Facebook, Apple or email account, which will specifically serve to generate routes according to the user's need.
Description	After creating the account through the means already mentioned above, access will be given to the system where you will have all the information available..
Goal	How many users create accounts with any of the mentioned methods.
Authors:	VICTOR ESPEJO                                                                                                 CARLOS GRANDA                                                                                                    JOSE IMBAQUINGA                                                                                                  MATEO LLUMIGUSIN                                                                                          JEFFREY MANOBANDA
Creation date	11/12/ 2021	Modification date	13/12/2021
Pre-conditions	The system must previously be connected or associated with several servers such as: Google Maps, the GPS location of the device, information of all cooperatives in Quito.
Actor	System

5.	Other Nonfunctional Requirements
5.1	Performance Requirements
●	The system will have a simple interface to facilitate the use for the user
●	The system in the interface will have a section for taxi cooperatives
●	The system in its interface will show the user's location at all times

5.2	Safety Requirements
●	The system shall not permit operation unless the user shares his location.
●	If the transport exceeds the speed limit, the system must notify the user.
5.3	Security Requirements
●	The system guarantees the security of the data entered, such as the user's personal information and location.
●	All external communications between the system's data server and clients will be encrypted.
5.4	Software Quality Attributes
●	Portability: The system will be implemented in Android and IOS
●	Reliability: The system will have to be in operation at all times
●	Maintainability: The system will notify users when maintenance will be performed by programmers.

5.5	Business Rules
●	The systems admin shall receive daily app usage statistics at the end of each working day.
●	When entering for the first time, the user must create an account in which they must enter an email address
●	At the time of filling in all the data, the registration system will create a new user account using the confirmed registration details.

6.	Other Requirements
A database for the aplication (Translate) calls for a server-side implementation The database will be using MySQL. The following provides an example of information that may be stored in the database:  
-Username 
-Name
-Email
-Password
Appendix A: Glossary
-Use case: tool that models the services offered by the system through a dialog between an actor and the system. User actions and system reactions. "A use case is a sequence of transactions provided by the system that provide a measurable result of values to a particular actor." 
-UML: Unified Modeling Language. Graphical programming language for modeling object-oriented software projects. 
-Requirement: A statement of need for some aspect of a system, often elicited directly from a stakeholder or captured from a source document
-Server: A central computer (server) which provides services such as file storage, printing, and communications in a network computing system   

