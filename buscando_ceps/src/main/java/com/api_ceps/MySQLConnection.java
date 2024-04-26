package com.api_ceps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.json.JSONObject;

public class MySQLConnection {
    public static void main(String[] args) {
        try {

            Connection connection = getConnection();

            if (connection != null) {
                System.out.println("Connected to the database!");
                connection.close();
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
    }

    public void salvarResultado(Object valores) {
        try {
            criarTabelaSeNaoExistir();

            Connection connection = getConnection();


            JSONObject jsonObject = new JSONObject(valores.toString());
            String cep = jsonObject.getString("cep");
            String state = jsonObject.getString("state");
            String city = jsonObject.getString("city");
            String neighborhood = jsonObject.getString("neighborhood");
            String street = jsonObject.getString("street");
            String service = jsonObject.getString("service");



            String sql = "INSERT INTO resultados_cep (cep, state, city, neighborhood, street, service) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cep);
            statement.setString(2, state);
            statement.setString(3, city);
            statement.setString(4, neighborhood);
            statement.setString(5, street);
            statement.setString(6, service);

            statement.executeUpdate();

            System.out.println("As informações referentes a esse CEP são essas:");
            System.out.println("CEP: " + cep);
            System.out.println("UF: " + state);
            System.out.println("Cidade: " + city);
            System.out.println("Vizinhança: " + neighborhood);
            System.out.println("Rua: " + street);

            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Erro ao salvar resultado no banco de dados");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://sql8.freemysqlhosting.net/sql8702038";
            String username = "sql8702038";
            String password = "4kELkyTPnX";

            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        }
        return connection;
    }

    public static void criarTabelaSeNaoExistir() {
        try {
            Connection connection = getConnection();

            // SQL para criar a tabela se não existir
            String sql = "CREATE TABLE IF NOT EXISTS resultados_cep ("
                       + "id INT AUTO_INCREMENT PRIMARY KEY,"
                       + "cep VARCHAR(255),"
                       + "state VARCHAR(255),"
                       + "city VARCHAR(255),"
                       + "neighborhood VARCHAR(255),"
                       + "street VARCHAR(255),"
                       + "service VARCHAR(255)"
                       + ")";

            PreparedStatement statement = connection.prepareStatement(sql);


            statement.executeUpdate();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela resultados_cep");
            e.printStackTrace();
        }
    }
}
