# Secure Java Login and Sign Up Application

This is a Java application that allows users to sign up for an account and log in to their account using a secure, hashed password stored in a MySQL database.
Setup

To set up and run the application, follow these steps:

    Install Java and MySQL on your system if they are not already installed.

    Create a new MySQL database for the application, and create a users table with columns id (int, primary key), username (varchar), and password (varchar).

    Download and add the MySQL Connector/J JDBC driver to your project classpath.

    Open the config.properties file in the project and update the following values:
        db.url: the URL of your MySQL database
        db.username: the username to use when connecting to the database
        db.password: the password to use when connecting to the database

    Compile the project by running the following command in the project directory:

javac *.java

Run the application by executing the Main class:

css

    java Main

## Usage

The application provides a simple command-line interface for users to sign up for an account and log in to their account. Upon launching the application, the user will be prompted to select from the following options:

    Sign up for a new account
    Log in to an existing account
    Quit the application

## Sign up for a new account

To sign up for a new account, the user will be prompted to enter a username and password. The password will be hashed using the SHA-256 algorithm and stored in the MySQL users table. If the sign-up is successful, the user will be notified and returned to the main menu.
## Log in to an existing account

To log in to an existing account, the user will be prompted to enter their username and password. The password will be hashed using the SHA-256 algorithm and compared to the hashed password stored in the users table. If the login is successful, the user will be returned to the main menu with a message indicating that they are logged in. If the login is unsuccessful, the user will be prompted to try again.
## Quit the application

To quit the application, the user can select option 3 from the main menu.
