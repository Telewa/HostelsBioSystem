
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wndessy
 */
public class DbModules {

    DbModules() {

    }

    int status = 0;
    static Connection con = null;

    /**
     * This code is for getting connection to the db
     *
     * @return connection string
     */
    VarCommon vars = new VarCommon();

    public static Connection getConnection() {
        try {
            commonConfig one = new commonConfig();
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());//remember this
            con = DriverManager.getConnection(one.getDb_url(), one.getUser(), one.getPassword());
            System.out.println("connected");
        } catch (SQLException sql) {
            System.out.println(sql.getMessage());
        }
        return con;
    }

    public boolean addUsser(VarCommon vars) {
        boolean present = false;

        String sql1 = "Insert into studentdetails(FirstName,MiddleName,LastName,Gender,Idnumber,RoomNumber,BioData)"
                + "   values  (\"" + vars.getFmane() + "\" ,\"" + vars.getMname() + "\",\"" + vars.getLname() + "\" ,\"" + vars.getGender() + "\",\"" + vars.getId() + "\",\"" + vars.getRoomNumber() + "\" ,\"" + vars.getBioData() + "\")";;
        try {
            Connection conn = DbModules.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql1);
        } catch (SQLException e) {
            System.out.println("Error checking availablility of component");
            System.out.println(sql1);

            e.printStackTrace();
        }
        return present;
    }

    public boolean edituser(VarCommon vars) {
        boolean present = false;

        String sql1 = "Insert into studentdetails(FirstName,MiddleName,LastName,Gender,Idnumber,RoomNumber,BioData)"
                + "   values  (\"" + vars.getFmane() + "\" ,\"" + vars.getMname() + "\",\"" + vars.getLname() + "\" ,\"" + vars.getGender() + "\",\"" + vars.getId() + "\",\"" + vars.getRoomNumber() + "\" ,\"" + vars.getBioData() + "\")";;
        try {
            Connection conn = DbModules.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql1);
        } catch (SQLException e) {
            System.out.println("Error checking availablility of component");
            System.out.println(sql1);

            e.printStackTrace();
        }
        return present;
    }

    public boolean addMewAdmin(VarCommon vars) {
        boolean present = false;

        String sql1 = "Insert into adminDetails(fname,lname,gender,emmailAddress,userName,password)"
                + "   values  (\"" + vars.getAdminFame() + "\" ,\"" + vars.getAdminLname() + "\",\"" + vars.getAdminGender() + "\" ,\"" + vars.getAdminEmail() + "\",\"" + vars.getAdminUsername() + "\",\"" + vars.getAdMinPassword() + "\")";;
        try {
            Connection conn = DbModules.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql1);
        } catch (SQLException e) {
            System.out.println("Error checking availablility of component");
            System.out.println(sql1);

            e.printStackTrace();
        }

        return present;
    }

    public VarCommon adminLogin(VarCommon user) {
        System.out.println("db modules validateLogin= email" + user.getAdminUsername()+ " pass" + user.getAdMinPassword()+ "");
        String usql = "SELECT  * FROM adminDetails WHERE username = \"" + user.getAdminUsername()+ "\" and  password = \"" + user.getAdMinPassword()        + "\"";
        try {
            Connection conn;
            conn = DbModules.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(usql);
            boolean test = rs.next();
            if (!test) {
                System.out.println("Failure login");
            } else if (test) {
                System.out.println("ssuucceessffuull login");
               // user.setEmail(rs.getString("email_adress"));
                //user.setPassword(rs.getString("password"));
                //call the findname method from within the class and setting  the return value to name 
               // user.setName(DbModules.findName(rs.getString("email_adress")));//
                user.setIsValid(true);
            }
        } catch (SQLException e) {
            System.out.println("an exception occured" + e + "");
        }
        return user;
    }

}
