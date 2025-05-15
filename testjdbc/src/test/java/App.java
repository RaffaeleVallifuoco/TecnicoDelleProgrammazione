import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        aggiungiDipendente(2, "Mario", "Verdi", 1800);
    }

    public static void aggiungiDipendente(int id, String nome, String cognome, double stipendio) {
        Connection conn = null;
        Statement stmt = null;

        String url = "jdbc:mysql://localhost:3306/test_jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "DJvirtual3D";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            String insert = "INSERT INTO dip(id, nome, cognome, stipendio) VALUES(" + id + ", '" + nome + "', '"
                    + cognome + "', " + stipendio + ");";
            int result = stmt.executeUpdate(insert);

            if (result > 0) {
                System.out.println(insert);
            } else {
                System.err.println("Problemi durante l'inserimento");
            }

        } catch (ClassNotFoundException e) {

            System.err.println("Classe non trovata");
            e.printStackTrace();

        } catch (SQLException e) {

            System.err.println("Eccezione SQL");
            e.printStackTrace();

        } catch (Exception e) {

            System.err.println("Eccezione generica");
            e.printStackTrace();

        } finally {

            if (stmt != null) {
                try {

                    stmt.close();
                    stmt = null;

                } catch (SQLException e) {

                    System.err.println("Errore chiusura statement");
                    e.printStackTrace();

                }
            }

            if (stmt != null) {
                try {

                    conn.close();
                    conn = null;

                } catch (SQLException e) {

                    System.err.println("Errore chiusura connessione");
                    e.printStackTrace();

                }
            }
        }

    }

}