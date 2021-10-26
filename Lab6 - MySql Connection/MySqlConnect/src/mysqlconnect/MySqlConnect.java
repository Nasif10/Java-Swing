package mysqlconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nasif
 */
public class MySqlConnect {
    
    Connection connect = null;
    
    public void connectDatabase(){
        try{
//          Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/connDB","root","");
            System.out.println("Successfully Connected to Mysql");

        }catch(Exception e){
            System.out.println("Not Connected..");
            e.printStackTrace();
        }
    }
    
    public ResultSet testQuery(){
            ResultSet resultSet = null;
        try{
            String query = "SELECT * FROM student";
            Statement statement ;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            
//            String query = "SELECT * FROM student WHERE student_name =? and id_student =?";
//            PreparedStatement pStatement = connect.prepareStatement(query);
//            pStatement.setString(1, "ABC");
//            pStatement.setString(2, "1");
//            resultSet = pStatement.executeQuery();
            
            System.out.println("Successfully Done Query..");
           
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }           
        return resultSet;
    }
    
    public void showResult(ResultSet resultSet) {
        try{
            while(resultSet.next()){
                int id = resultSet.getInt("student_id");
                String name = resultSet.getString("student_name");
                String dept_name = resultSet.getString("student_dept");
                double total_cred = resultSet.getDouble("student_credit");         
                System.out.println(id + " " + name + " " + dept_name+" "+total_cred);
            }
        }catch(Exception e){
            e.printStackTrace();
        }      
    }
    
    public void insertData(){
        try{
            String query = "INSERT INTO student (student_name,student_dept,student_credit) values(?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1, "DEF");
            pStatement.setString(2, "CE");
            pStatement.setString(3, "125.2");
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully Insert..");
            
            
        }catch(Exception e){
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    

   
    public static void main(String[] args) {
        
        MySqlConnect db = new MySqlConnect();
        db.connectDatabase();
        ResultSet rs = db.testQuery();
        db.showResult(rs);
        db.insertData();
    }
    
}
