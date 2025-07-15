package com.vetias.java.workshop.temperaturedata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.vetias.java.workshop.temperaturedata.beans.Organization;
public class JDBCExample {
    public static void main(String[] args) {
        Connection dbConnection=null;
        try{
            Class.forName("org.h2.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            dbConnection=DriverManager.getConnection("jdbc:h2:mem:tempdataDB","sa",null);

         }catch(SQLException sqlException){
            System.out.println("error:"+sqlException);
         }
        }
    }
 OrganizationDAO organizationDAO=new OrganizationDAO();
 organizationDAO.createTable(dbConnection);
 Organization vet=new Organization("VET",
 "Vellalar Education Trust",
 "www.vet.com",
 "contact@vet.com",
 "+91_9856890923",
 1231234L,null);
 organizationDAO.save(dbConnection,vet);       
    

