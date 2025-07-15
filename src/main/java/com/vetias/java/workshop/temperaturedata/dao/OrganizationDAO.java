package com.vetias.java.workshop.temperaturedata.OrganizationDAO;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Organization;

public class OrganizationDAO {
    public void createTable(Connection dbConnection) {

        try (Statement statement = dbConnection.createStatement()){
            statement.execute("CREATE TABLE organization (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "NAME VARCHAR(100)," +
                    "WEBSITE VARCHAR(100)," +
                    "EMAIL VARCHAR(100)," +
                    "CONTACT_NUMBER VARCHAR(100)," +
                    "REGISTRATION_NO INT," +
                    "DESCRIPTION VARCHAR(255)");
        } catch (SQLException sqlException) {
            System.out.println("Error: " + sqlException);
        }
    }

    public int save(Connection dbConnection,Organization vet){
        try(PreparedStatement preparedStatement=dbConnection.
        preparedStatement("insert into organization(name,website,email,contact_number,registration_no,description values(?,?,?,?,?,?)")) {
                    preparedStatement.setString(1,vet.name());
                    preparedStatement.setString(2,vet.website());
                    preparedStatement.setString(3,vet.email());
                    preparedStatement.setString(4,vet.contactNumber());
                    preparedStatement.setString(5,vet.registerationNumber());
                    preparedStatement.setString(6,vet.description());
                    preparedStatement.executeUpdate();
                }catch(SQLException sqlException){
                    System.out.println("error inserting into table:"+sqlException);
                }
                return 0;

                }

    }

