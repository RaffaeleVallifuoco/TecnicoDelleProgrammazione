package it.raffo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        aggiungiGatto(1, "Ubaldo", 2, "Bianco");
        aggiungiGattoByPreparedStatement(2, "Zuzzurello", 1, "Nero");
        // rimuoviGatto(1);
        stampaGatti();
        // rimuoviTuttiIGatti();

    }

    public static void aggiungiGatto(int microchip, String nome, int age, String colore_pelo) {

        Connection conn = null;
        Statement stmt = null;

        String url = "jdbc:mysql://localhost:3306/gatti_jdbc";
        String username = "root";
        String password = "DJvirtual3D";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();

            // INSERT INTO dip VALUES(microchip, nome, age, colore_pelo);
            String insert = "INSERT INTO Gatto (microchip, nome, age, colore_pelo) VALUES("
                    + microchip + ", '" + nome + "', " + age + ", '" + colore_pelo + "');";
            int result = stmt.executeUpdate(insert);
            if (result > 0) {
                System.out.println(insert);
            } else {
                System.out.println("Problemi durante l'inserimento");
            }

        }

        catch (ClassNotFoundException e) {
            System.out.println("Classe non trovata");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Eccezione specifica di SQL");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Eccezione generica");
            e.printStackTrace();

        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                    stmt = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Errore durante la chiusura dello statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Errore durante la chiusura della connessione");
                }
            }
        }
    }

    public static void aggiungiGattoByPreparedStatement(int microchip, String nome, int age, String colore_pelo) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String url = "jdbc:mysql://localhost:3306/gatti_jdbc";
        String username = "root";
        String password = "DJvirtual3D";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            String query = "INSERT INTO Gatto (microchip, nome, age, colore_pelo) VALUES (?,?,?,?)";
            stmt = conn.prepareStatement(query);

            stmt.setInt(1, microchip);
            stmt.setString(2, nome);
            stmt.setInt(3, age);
            stmt.setString(4, colore_pelo);

            stmt.execute();
            System.out.println("Inserimento effettuato");

        } catch (ClassNotFoundException e) {
            System.out.println("Classe non trovata");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Eccezione specifica di SQL");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Eccezione generica");
            e.printStackTrace();

        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                    stmt = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Errore durante la chiusura dello statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Errore durante la chiusura della connessione");
                }
            }
        }
    }

    public static void rimuoviGatto(int microchip) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String url = "jdbc:mysql://localhost:3306/gatti_jdbc";
        String username = "root";
        String password = "DJvirtual3D";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            String delete = "DELETE FROM Gatto WHERE microchip = ?";
            stmt = conn.prepareStatement(delete);
            stmt.setInt(1, microchip);
            stmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            System.out.println("Classe non trovata");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Eccezione specifica di SQL");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Eccezione generica");
            e.printStackTrace();

        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                    stmt = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Errore durante la chiusura dello statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Errore durante la chiusura della connessione");
                }
            }
        }
    }

    public static void stampaGatti() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/gatti_jdbc";
        String username = "root";
        String password = "DJvirtual3D";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            stmt = conn.createStatement();

            resultSet = stmt.executeQuery("SELECT * FROM Gatto");

            // con rs.next() mi sposto di riga in riga sulla tabella del DB
            // con rs.getTipo(indice) leggo il valore associato a quello dell'indice
            // le colonne della tabella partono da indice = 1
            while (resultSet.next()) {
                System.out.println("Gatto: microchip = " + resultSet.getInt(1) + " , nome = " +
                        resultSet.getString(2) + " , age = " + resultSet.getInt(3) + " , colore_pelo = "
                        + resultSet.getString(4));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Classe non trovata");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Eccezione specifica di SQL");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Eccezione generica");
            e.printStackTrace();

        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                    stmt = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Errore durante la chiusura dello statement");
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Errore durante la chiusura della connessione");
                }
            }
        }
    }

    public static void rimuoviTuttiIGatti() {
        Connection conn = null;
        Statement stmt = null;

        String url = "jdbc:mysql://localhost:3306/gatti_jdbc";
        String username = "root";
        String password = "DJvirtual3D";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();

            String deleteAll = "DELETE FROM Gatto";
            int righeEliminate = stmt.executeUpdate(deleteAll);
            System.out.println("Righe eliminate: " + righeEliminate);

        } catch (ClassNotFoundException e) {
            System.out.println("Classe non trovata");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Eccezione specifica di SQL");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Eccezione generica");
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
