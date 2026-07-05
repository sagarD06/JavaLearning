import java.sql.*;

public class Demo {
    public static void main(String[] args) {
    /*
    * import package
    * load and open connection
    * create statement
    * execute statement
    * process the results
    * close connection
    */
        String url = "jdbc:postgresql://localhost:5432/JDBCP";
        String uName = "postgres";
        String uPass = "postgres";
//        String query = "select * from Students";
        String query2 = "insert into Students values (?,?,?)";
        Connection connection;

        int id = 6;
        String name = "Danny";
        int age = 20;

//        try{
//            Class.forName("org.postgresql.Driver");
//        }
//        catch(ClassNotFoundException e){
//            System.out.println(e);
//        } -> java automatically does this.

        try{
            connection = DriverManager.getConnection(url,uName,uPass);
            System.out.println("Connected to database successfully");

//            Statement st = connection.createStatement(); -> use only when select * query is used
            PreparedStatement st =  connection.prepareStatement(query2);
            st.setInt(1, id);
            st.setString(2, name);
            st.setInt(3, age);
//            ResultSet res = st.executeQuery(query);
//            while(res.next()){
//                System.out.print(res.getInt(1) + " - ");
//                System.out.print(res.getString(2) + " - ");
//                System.out.println(res.getString(3));
//            }

            st.execute();

            connection.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}