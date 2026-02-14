import java.sql.DriverManager;
public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        DriverManager.getConnection("jdbc:mysql://localhost:jdbc_db","root","Gugu@2003");
        con.prepairStatement("insert into table_name values()")
    }
}
