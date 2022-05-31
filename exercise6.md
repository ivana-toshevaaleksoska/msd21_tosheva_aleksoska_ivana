---
title: Exercise 4 (SOURCE CODE TEST)  
date: 31.05.2022
---
# Exercise 6 (Documentation)
The aim of this exercise is to integrate different aspects of 
documentation into the project and to follow best practices.

## What is necessary to generate Maven site documentation?

There is a secret that needs to be understood in order to write good software documentation: there isn’t one thing called documentation, there are four.
1. Tutorials - Lessons that take the reader by the hand to complete a series of steps to achieve a small meaningful goal.
   They are wholly learning-oriented, and specifically, they are oriented towards learning how rather than learning that.  

2. How-to guides - take the reader through the steps required to solve a real-world problem.
They are recipes, directions to achieve a specific end - for example: how to create a web form; how to plot a three-dimensional data-set; how to enable LDAP authentication.
They are wholly goal-oriented.
How-to guides are wholly distinct from tutorials and must not be confused with them:  

```- A tutorial is what you decide a beginner needs to know.```  
```- A how-to guide is an answer to a question that only a user with some experience could even formulate.```

In a how-to guide, you can assume some knowledge and understanding. You can assume that the user already knows how to do basic things and use basic tools.  

3. Explanation, or discussions, clarify and illuminate a particular topic. 
They broaden the documentation’s coverage of a topic.  
They are understanding-oriented.
Explanations can equally well be described as discussions; they are discursive in nature. 
They are a chance for the documentation to relax and step back from the software, taking a wider view, illuminating it from a higher level or even from different perspectives. 

4. Reference guides are technical descriptions of the machinery and how to operate it.
Reference guides have one job only: to describe. They are code-determined, because ultimately that’s what they describe: key classes, functions, APIs, and so they should list things like functions, fields, attributes and methods, and set out how to use them.
Reference material is information-oriented.
By all means technical reference can contain examples to illustrate usage, but it should not attempt to explain basic concepts, or how to achieve common tasks.
Reference material should be austere and to the point.

## What different aspects, configurations, information, etc. are configured in site.xml or pom.xml?  
A Project Object Model or POM is the fundamental unit of work in Maven. 
It is an XML file that contains information about the project and configuration details used by Maven to build the project. 
It contains default values for most projects. 
Examples for this is the 
- build directory, which is target; 
- the source directory, which is src/main/java; 
- the test source directory, which is src/test/java; 
- and so on. 
- When executing a task or goal, Maven looks for the POM in the current directory.  
It reads the POM, gets the needed configuration information, then executes the goal.  
Some configuration that can be specified in the POM are the project dependencies, the plugins or goals that can be executed, the build profiles, and so on. 
Other information such as the project version, description, developers, mailing lists and such can also be specified.  

In this case the pom.xml is extended with the Maven Javadoc plugin and the maven site plugin that has this structure:
<build>
 <plugins>
  <plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-javadoc-plugin</artifactId>
   <version>3.0.0</version>
   <configuration>
    <source>1.8</source>
    <target>1.8</target>
   </configuration>
  </plugin>
  <plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-site-plugin</artifactId>
   <version>3.7.1</version>
  </plugin>
 </plugins>
</build>