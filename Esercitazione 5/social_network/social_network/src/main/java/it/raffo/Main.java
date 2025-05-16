package it.raffo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nVisualizza utenti\n");
        findAllUsers();

        System.out.println("\nTrova utente da id\n");
        findUsersById(1);

        System.out.println("\nTrova utente da nick\n");
        findUsersByNickname("raffo");
        findUsersByNickname("ra%");

        addUser(2, "cicco", "1234", "bello");
        findAllUsers();
        // deleteUser(2);

    }

    // AGGIUNGI USER

    public static void addUser(int id, String nickname, String pass, String hobby) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String url = "jdbc:mysql://localhost:3306/social_network";
        String username = "root";
        String password = "DJvirtual3D";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            String query = "INSERT INTO User (id, nickname, password, hobby) VALUES (?,?,?,?)";
            stmt = conn.prepareStatement(query);

            stmt.setInt(1, id);
            stmt.setString(2, nickname);
            stmt.setString(3, pass);
            stmt.setString(4, hobby);

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

    // CANCELLA USER

    public static void deleteUser(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String url = "jdbc:mysql://localhost:3306/social_network";
        String username = "root";
        String password = "DJvirtual3D";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            String delete = "DELETE FROM User WHERE id = ?";
            stmt = conn.prepareStatement(delete);
            stmt.setInt(1, id);
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

    // FIND ALL USER

    public static void findAllUsers() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/social_network";
        String username = "root";
        String password = "DJvirtual3D";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            stmt = conn.createStatement();

            resultSet = stmt.executeQuery("SELECT * FROM User");

            while (resultSet.next()) {
                System.out.println(
                        "Utente: \n" +
                                "\nid       : " + resultSet.getInt(1) +
                                "\nnickname : " + resultSet.getString(2) +
                                "\npassword : " + resultSet.getString(3) +
                                "\nhobby    : " + resultSet.getString(4) +
                                "\n-------------------------");
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

    // FIND USER BY ID

    public static void findUsersById(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/social_network";
        String username = "root";
        String password = "DJvirtual3D";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM User WHERE id = ?";
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);

            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                System.out.println(
                        "Utente:" +
                                "\nid       : " + resultSet.getInt(1) +
                                "\nnickname : " + resultSet.getString(2) +
                                "\npassword : " + resultSet.getString(3) +
                                "\nhobby    : " + resultSet.getString(4) +
                                "\n-------------------------");
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

    // FIND USER BY NICKNAME

    public static void findUsersByNickname(String nickname) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/social_network";
        String username = "root";
        String password = "DJvirtual3D";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM User WHERE nickname LIKE ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, nickname);

            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                System.out.println(
                        "Utente:" +
                                "\nid       : " + resultSet.getInt(1) +
                                "\nnickname : " + resultSet.getString(2) +
                                "\npassword : " + resultSet.getString(3) +
                                "\nhobby    : " + resultSet.getString(4) +
                                "\n-------------------------");
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
}