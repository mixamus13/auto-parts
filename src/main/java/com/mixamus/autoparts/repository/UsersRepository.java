package com.mixamus.autoparts.repository;

import com.mixamus.autoparts.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class UsersRepository {

    public static Set<Object> lists = Set.of(
            new User(1, "Pered", "Bob", "Helsen", "er3hfwfh3fh", "9035556677", true),
            new User(2, "Hered", "Elen", "HelKilopolsen", "efcegrvefqc", "9294569812", true),
            new User(3, "Dase", "Nick", "Sedas", "uknytukbcaev", "9015326457", true),
            new User(4, "Poloi", "Brain", "Ikilopo", "vygcwetecce", "9011116634", false),
            new User(5, "Nikols", "Amanda", "Poloir", "cfegrtf464v", "921559913", true),
            new User(6, "Bered", "Vera", "Seretut", "kuktbryvhg45", "9995256644", false),
            new User(7, "Swere", "Melisa", "Mered", "dscsvd4564dfvd", "9235226699", true),
            new User(7, "Kolop", "Jim", "Sderew", "csdf456456fgv", "9114441177", true)

    );
}
