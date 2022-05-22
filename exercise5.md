---
title: Exercise 4 (SOURCE CODE TEST)  
date: 15.05.2022
---
# Exercise 5 (GIT Branching)

## Why are logging libraries used?
Logging libraries help developers create and manage log events, which can increase the overall efficiency and functionality of your application.

- Most allow you to turn on only portions of the logging to get more detail.
- Logging libraries allow you to configure logging through an external file, so it's easy to turn on or off in production without having to recompile, deploy, etc.
- Most libraries allow you to log portions or all of your statements to one or many files.
- They are easy to learn, setup, and use.

## What log levels are there in Log4J and what is it all about?

Log libraries allow for various levels of logging per statement 
- ALL	- All levels including custom levels.
- DEBUG	- Designates fine-grained informational events that are most useful to debug an application.
- INFO	- Designates informational messages that highlight the progress of the application at coarse-grained level.
- WARN	- Designates potentially harmful situations.
- ERROR	- Designates error events that might still allow the application to continue running.
- FATAL	- Designates very severe error events that will presumably lead the application to abort.
- OFF	- The highest possible rank and is intended to turn off logging.
- TRACE	- Designates finer-grained informational events than the DEBUG.

## What configuration options does log4J offer?

Configuration of Log4j 2 can be accomplished in 4 ways:

1. Through a configuration file written in XML, JSON, YAML, or properties format.
2. By creating a ConfigurationFactory and Configuration implementation.
3. By calling the APIs exposed in the Configuration interface to add components to the default configuration.
4. By calling methods on the internal Logger class.

All 4 options are equivalent. For example, a configuration file in XML can be rewritten using the properties format 
(and the opposite) without any loss of functionality. However, the hierarchical nature of a Log4j configuration can be 
captured better in formats which naturally support nesting so XML, JSON, and YAML files, are usually easier to use.