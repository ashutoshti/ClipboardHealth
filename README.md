# ClipboardHealth
ClipboradHealth Automation Test

This Project Created in The Intellij with the JAVA version 1.8.

# Following Project Description:-
    Its a Hybrid Framework having Following techonologies such Cucumber, Gherkins, testng, and Junit.
    
Now This Code Can Run on the Chrome Browser as well as The FireFox

# Steps To Run The Code
1. Pull The latest version of the Code From the git.
   1. Update the Code via Internet and Download the Dependencies.
   2. Go To the Directory ClipboardHealth>src>test>testrunner>MyRunner.java
   3. Right-Click on the File.
   4. Click on the Run as>MyTestRunner{ if you are using the Intellij} Or {if You 
      the eclipse click on the Junit}.

# Features of this Project
* This project design the BDD Framework which means any user such as a Technical Person
  Like Technical Lead, Automation tester or Developer can se how the automation works
  Also, the Non-technical Member Like Scrum Master, CEO, CTO also see the execution of code.

  * The Code is Written in the Dynamic Way such if user want to run this code on the different Brand
    then he/she just needs to change the brand name in the Feature File.
  
# Framework Description:- 
1. src>main>java
   1. driver{package}:- 
      1. Driverfactory:-Its Contains all the information related to the driver. Which Browser need to invoke.
                               Maximise of the browser and application URL.
      2. Constant Variable:- Describe all the constant variable of the application such username and password also the application URL 
   2. pages{package}:- This package contains all the Page related method and their web elements.
   3. Util{package}:- 
      1. ElementUtil:-This package contains all the Util Classes which are comman and which can used multiple times. 
      2. ConfigReader:- This File is used to read the config file for passing the browser-name in the code.

2. src>test>java
   1. parallel:- 
      1. Application Hooks: -This Package Contains the Application Hooks Which invokes before the execution and describe the behaviour of the code.
      2. customerReport Listener: - This File is Used to gernate the Extent report.
      3. HomePage: - This Java File Contains the Step Definition which means how the Gherkin Language code interact with the java code of the amazon Home Page when user landed through the https://www.amazon.in/ 
      4. TelevisionPage:- Similar this is the Step Definition of the television Page when user select the Brand name of television from the page as per the prerequisites.
   2. testrunner: -
      1. This is the runner File from Where any user can run the code according to the test condition
      
3. src>test>resources
   1. config{Folder}: - This Folder contains the property file having the browser name.
   2. Executable_Driver:- This Folder contains all the driver exe which helpful to run the code on the browser.
   3. Feature:- This Folder contains all the feature of the Project Which helps all the members which wants to see the automation process. This File written in the Gherkin Langauage which means the normal English Language such as Given, When, Then, And etc.