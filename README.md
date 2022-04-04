# Project 0 - CLI application with JDBC

A Java-based CLI (Command Line Interface) application. Data should be stored in a PostgreSQL database, and your application should be able to read and manipulate data from the database using JDBC. The direction of the application beyond that is up to you, but here are a few suggestions:

* Banking application
* Journaling application
* Employee management system
* Simple text-based game
* E-Commerce platform
* Anything else that can fulfill the requirements below!!!

## Application Requirements

* Your application must perform basic CRUD (create, read, update, delete) functionality with data stored in a database.
* Your Database must have at least two tables, with a relationship between at least the tables.
* Your application should have a CLI where users can interact with the application/database while it's running.
* You must implement unit tests with JUnit. Around 10 tests is fine. (I'd recommend testing whether or not your DAO methods work appropriately).
* Users must be able to log in before they can use the application. You'll want to gather a username and password, and check them against usernames/passwords stored in the Database.
* Other than those requirements, the purpose and functionality of the application is up to you!

## Tech Stack

* Java 1.8
* PostgreSQL
* Maven 
* git (GitHub)

## Presentation

* 5 minute live demo. Present the application's functionality, not the code itself. Feel free to show the Entity Relationsihp Diagram (ERD).

## Git Help

For this project, we only need basic git usage. You should do the following steps to set up:

* Clone your repository (using the link found in the code button of your repository) wherever you'd like it to be in your file explorer
* Import the project into your IDE

You should run the following commands frequently to save your local changes to your github repository:

* git add . (stage all your changes to be committed)
* git status (just to see what has changed)
* git commit -m"A message to describe what work you've done"
* git push (push the committed changes into your repository)

Make sure you're in your cloned repo or attempting to push won't work! You'll see (main) at the end of your file path if you're in the correct spot

## ----------------------------------------------------------------
Welcome to the bottom of this long README! Here are some misc. tips

There are a lot of files in here... you mostly will want to worry about pom.xml for dependencies, and the src folder for your actual code. Good luck!

There are only two placeholders in the src folder... don't forgot you want to make a package structure similar to P0Demo

Help each other but don't do each other's work!!! If you cheat you're only cheating yourself blah blah blah

Have fun and learn as much as you can
