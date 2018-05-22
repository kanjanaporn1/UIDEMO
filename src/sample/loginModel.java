package sample;

import dbUtil.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginModel {
    Connection connection;
    //constructor
    public loginModel (){
        try{
            this.connection = dbConnection.getConnection();
            } catch (SQLException e) {
            e.printStackTrace();
        }
        if (this.connection ==null) System.exit(1);

    }
    public boolean isDatabaseConnection(){
        return this.connection !=null;
    }


}

public  boolean isLogin (String username, String password){
    PreparedStatement pr = null;
    ResultSet rs = null;

    String sql = "select * from admin where username = ? and passwoed = ?";
    try {
        pr = this.connection.prepareStatement (sql);
        pr.setString( 1,username);
        pr.setString(2,password);

        rs = pr.executeQuery();
        if (rs.next()){
            return false;
        }
        finally{
            pr.close();
            rs.close();

        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
