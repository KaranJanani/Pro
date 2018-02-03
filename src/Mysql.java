import java.sql.*;

public class Mysql  {
    PreparedStatement ps;
    Connection con;


    Mysql() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata", "root", "root");

            System.out.println("SUCCESS");

        } catch (Exception e) {
            System.out.println(e);

        }

    }

//    String uname=tf.getText();
  //  String pass=tf2.getText();
    public void adduser(String user_id,String user_type,String username,String password) {

        try {
            ps=con.prepareStatement("insert into users(user_id,user_type,username,password) values(?,?,?,?)");

            ps.setString(1,user_id);
            ps.setString(2,user_type);
            ps.setString(3,username);
            ps.setString(4,password);
            ps.executeUpdate();
            System.out.println("Added Sucessfully");

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();

        }

    }
    public void deleteuser(String username)
    {


        try
        {
                ps = con.prepareStatement("delete from users where username = ?") ;
                ps.setString(1,username);
                ps.executeUpdate();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}