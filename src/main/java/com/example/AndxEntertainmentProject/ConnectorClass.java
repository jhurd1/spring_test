package com.example.AndxEntertainmentProject;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration 
public class ConnectorClass
{
        /*******************************
         * DATA MEMBERS
         * *****************************/
        //This string's parameters need supplanting
        static final String JDBC_DRIVER = "jdbc:postgresql://ec2-34-206-8-52.compute-1.amazonaws.com:5432/de24ms08vdee4r";
        static final String username = "ezluaolvxynfhc";
        static final String password = "ee90403ecc64c67267de02f1cddb613c97a0c48bf3bbc65789dd88c9f8c18d13";
        static final String URI = "postgres://ezluaolvxynfhc:ee90403ecc64c67267de02f1cddb613c97a0c48bf3bbc65789dd88c9" +
                "f8c18d13@ec2-34-206-8-52.compute-1.amazonaws.com:5432/de24ms08vdee4r";

        /*******************************
         * CONSTRUCTORS
         * *****************************/
        public ConnectorClass()
        {

        }

        /*******************************
         * ACCESSORS AND MUTATORS
         * *****************************/
        public static String getJdbcDriver()
        {
            return JDBC_DRIVER;
        }

        public static String getUsername()
        {
            return username;
        }

        public static String getPassword()
        {
            return password;
        }



        /*******************************
         * @connect
         * This function will manage the
         * connection to the DB
         *
         * As adapted from
         * https://www.postgresqltutorial
         * .com/postgresql-jdbc/connecting
         * -to-postgresql-database/
         * *****************************/
        public static Connection connect() throws URISyntaxException, SQLException
            {
                String dbUrl = System.getenv("JDBC_DATABASE_URL");
                return DriverManager.getConnection(dbUrl);
            }
    }
