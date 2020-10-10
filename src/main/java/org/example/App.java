package org.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App implements ApplicationRunner {

    private  UserRepository userRepository;
    private GameRepository gameRepository;

    public App(UserRepository userRepository, GameRepository gameRepository) {
        this.userRepository = userRepository;
        this.gameRepository = gameRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Elo");


//        User user= new User("0","Cinek","Chojno",22);
//        userRepository.save(user);
        User user1= new User("3","Cinek","Chojno",22);
        userRepository.save(user1);
//        System.out.println("Zapisano usera:" + user);
//        Game game1 = new Game("0","Wiedzmin");
//        gameRepository.save(game1);
//        System.out.println();

        List<User> all = userRepository.findAll();
        System.out.println("All users:");
        System.out.println(all);
        System.out.println();
        System.out.println("All Games: ");
        List<Game> allGame = gameRepository.findAll();
        System.out.println(allGame);


    }
}
