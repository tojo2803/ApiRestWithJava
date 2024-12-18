package org.example.routes;

import com.google.gson.Gson;
import org.example.models.User;
import org.example.service.UserService;
import spark.Spark;

public class UserRoute {
    private static final Gson gson = new Gson();
    private static final UserService userService = new UserService();

    public static void initRoutes() {
        Spark.get("/",(req, res) -> {
            System.out.println("Serveur en cours d'execution.");
            return gson.toJson(userService.getAllUser());
        });
        Spark.post("/createUser",( req , res) -> {
            System.out.println(req.body());
            System.out.println(gson.fromJson(req.body(), User.class));
            User user = gson.fromJson(req.body(), User.class);
            userService.addUser(user.getUsername(), user.getEmail(), user.getPassword());
            res.status(201);
            return "User created";
        });
        Spark.delete("/deleteUser", (req, res) -> {
            int id = Integer.parseInt(req.queryParams("id"));
            userService.deleteUser(id);
            res.status(200);
            return "User deleted";
        });
        Spark.put("/putUser",(req, res) -> {
            int id = Integer.parseInt(req.queryParams("id"));
            User user = gson.fromJson(req.body(), User.class);
            userService.updateUser(id, user.getUsername(), user.getEmail(), user.getPassword());
            return "user updated";
        });
    }
}
