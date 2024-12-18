package org.example.service;

import org.example.models.User;
import org.example.db.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserService {
    Database db = new Database();

    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM User";
        try{
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                users.add(new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("role")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return users;
    }

    public void addUser(String username, String email, String password){
        String query = "INSERT INTO User (username,email,password,role) VALUES (?,?,?,?)";
        try{
            Connection con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(query);
                statement.setString(1,username);
                statement.setString(2,email);
                statement.setString(3,password);
                statement.setString(4, "user");
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void deleteUser(int id){
        String query = "DELETE FROM User WHERE id = ?";
        try{
            Connection con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,id);
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void updateUser(int id, String username, String email, String password) {
        String query = "UPDATE User SET username = ?, email = ?, password = ? WHERE id = ?";
        try{
            Connection con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1,username);
            statement.setString(2,email);
            statement.setString(3,password);
            statement.setInt(4,id);
            statement.executeUpdate();
        }catch (SQLException e){}
    }
    public void loginUser(String username, String password){
        //verifier si le nom d'utilisateur existe et verifier si le password correspond :
        //si oui:
            //rediriger l'utisateur vers le dashboard
            //gernerer un token à partir de son information qui va etre recuperer par le front
        //si non:
            //retourner une message d'erreur
    }

}
