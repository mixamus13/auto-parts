package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersRepository {

    public static List<User> users = List.of(
            new User("Pered", "Bob", "Helsen", "er3hfwfh3fh", "9035556677"),
            new User("Hered", "Elen", "HelKilopolsen", "efcegrvefqc", "9294569812"),
            new User("Dase", "Nick", "Sedas", "uknytukbcaev", "9015326457"),
            new User("Poloi", "Brain", "Ikilopo", "vygcwetecce", "9011116634"),
            new User("Nikols", "Amanda", "Poloir", "cfegrtf464v", "921559913"),
            new User("Bered", "Vera", "Seretut", "kuktbryvhg45", "9995256644"),
            new User("Swere", "Melisa", "Mered", "dscsvd4564dfvd", "9235226699"),
            new User("Kolop", "Jim", "Sderew", "csdf456456fgv", "9114441177")
    );

    public List<User> getAllUsers() {
        return users;
    }
}
