package com.mixamus.autoparts.dao;

import com.mixamus.autoparts.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UsersRepository implements RepositoryManipulation<User> {

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

    private static Map<String, String> indexByUserName = Map.of(
            "Pered", "1",
            "Hered", "2",
            "Dase", "3",
            "Poloi", "4",
            "Nikols", "5",
            "Bered", "6",
            "Swere", "7",
            "Kolop", "8"
    );

    @Override
    public User create() {
        return new User();
    }

    @Override
    public User update(User name) {
        return null;
    }

    @Override
    public User getByName(String name) {
        String key = indexByUserName.get(name);
        return users.get(key);
    }

    @Override
    public void delete(String id) {

    }
}
