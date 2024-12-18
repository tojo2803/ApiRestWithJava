package org.example;
import org.example.routes.UserRoute;
import spark.Spark;
public class Main {

    public static void main(String[] args) {
        Spark.port(8080);
        UserRoute.initRoutes();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            Spark.stop();
            System.out.println("Serveur arrêté.");
        }));
    }
}