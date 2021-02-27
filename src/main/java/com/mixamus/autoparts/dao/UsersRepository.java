package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UsersRepository {

//    private static Map<String, User> users;
//
//    static {
//        users = new HashMap<>();
//        users.put("1", new User("Pered", "Bob", "Helsen", "er3hfwfh3fh", "9035556677"));
//        users.put("2", new User("Hered", "Elen", "HelKilopolsen", "efcegrvefqc", "9294569812"));
//        users.put("3", new User("Dase", "Nick", "Sedas", "uknytukbcaev", "9015326457"));
//        users.put("4", new User("Poloi", "Brain", "Ikilopo", "vygcwetecce", "9011116634"));
//        users.put("5", new User("Nikols", "Amanda", "Poloir", "cfegrtf464v", "921559913"));
//        users.put("6", new User("Bered", "Vera", "Seretut", "kuktbryvhg45", "9995256644"));
//        users.put("7", new User("Swere", "Melisa", "Mered", "dscsvd4564dfvd", "9235226699"));
//        users.put("8", new User("Kolop", "Jim", "Sderew", "csdf456456fgv", "9114441177"));
//    }

//    private static final Map<String, User> users = new HashMap<>() {{
//        put("1", new User("Pered", "Bob", "Helsen", "er3hfwfh3fh", "9035556677"));
//        put("2", new User("Hered", "Elen", "HelKilopolsen", "efcegrvefqc", "9294569812"));
//        put("3", new User("Dase", "Nick", "Sedas", "uknytukbcaev", "9015326457"));
//        put("4", new User("Poloi", "Brain", "Ikilopo", "vygcwetecce", "9011116634"));
//        put("5", new User("Nikols", "Amanda", "Poloir", "cfegrtf464v", "921559913"));
//        put("6", new User("Bered", "Vera", "Seretut", "kuktbryvhg45", "9995256644"));
//        put("7", new User("Swere", "Melisa", "Mered", "dscsvd4564dfvd", "9235226699"));
//        put("8", new User("Kolop", "Jim", "Sderew", "csdf456456fgv", "9114441177"));
//    }};

    private static Map<String, User> users = Map.of(
            "1", new User("Pered", "Bob", "Helsen", "er3hfwfh3fh", "9035556677"),
            "2", new User("Hered", "Elen", "HelKilopolsen", "efcegrvefqc", "9294569812"),
            "3", new User("Dase", "Nick", "Sedas", "uknytukbcaev", "9015326457"),
            "4", new User("Poloi", "Brain", "Ikilopo", "vygcwetecce", "9011116634"),
            "5", new User("Nikols", "Amanda", "Poloir", "cfegrtf464v", "921559913"),
            "6", new User("Bered", "Vera", "Seretut", "kuktbryvhg45", "9995256644"),
            "7", new User("Swere", "Melisa", "Mered", "dscsvd4564dfvd", "9235226699"),
            "8", new User("Kolop", "Jim", "Sderew", "csdf456456fgv", "9114441177")
    );

    public User getByUserName(String userName) {
        return users.get(userName);
    }
}
