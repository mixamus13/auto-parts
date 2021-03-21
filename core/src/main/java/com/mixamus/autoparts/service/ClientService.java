package com.mixamus.autoparts.service;

import com.mixamus.autoparts.dao.ClientDao;
import com.mixamus.autoparts.domain.Client;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService {

    final ClientDao clientDao;

    public List<Client> getAllUsers() {
        return clientDao.findAll();
    }

    public Optional<Client> getClientById(int id) {
        return clientDao.findById(id);
    }

    public Client createClient(Client client) {
        return clientDao.save(client);
    }

    public void deleteClientById(int id) {
        clientDao.deleteById(id);
    }

    public void updateClientById(Client userName) {
        clientDao.save(userName);
    }

    public Client findClientByFirstname(String userName) {
        return clientDao.findClientByFirstname(userName);
    }

//    public void deleteByUsername(String userName) {
//        userDao.delete(userName);
//    }


//    private static Map<String, User> users = Map.of(
//            "1", new User(1, "Pered", "Bob", "Helsen", "er3hfwfh3fh", "9035556677"),
//            "2", new User(2, "Hered", "Elen", "HelKilopolsen", "efcegrvefqc", "9294569812"),
//            "3", new User(3, "Dase", "Nick", "Sedas", "uknytukbcaev", "9015326457"),
//            "4", new User(4, "Poloi", "Brain", "Ikilopo", "vygcwetecce", "9011116634"),
//            "5", new User(5, "Nikols", "Amanda", "Poloir", "cfegrtf464v", "921559913"),
//            "6", new User(6, "Bered", "Vera", "Seretut", "kuktbryvhg45", "9995256644"),
//            "7", new User(7, "Swere", "Melisa", "Mered", "dscsvd4564dfvd", "9235226699"),
//            "8", new User(8, "Kolop", "Jim", "Sderew", "csdf456456fgv", "9114441177")
//    );
//
//    private static Map<String, String> indexByUserName = Map.of(
//            "Pered", "1",
//            "Hered", "2",
//            "Dase", "3",
//            "Poloi", "4",
//            "Nikols", "5",
//            "Bered", "6",
//            "Swere", "7",
//            "Kolop", "8"
//    );
//
//    @Override
//    public User create(User user) {
//        return new User();
//    }
//
//    @Override
//    public User update(User name) {
//        return null;
//    }
//
//    @Override
//    public User getByName(String name) {
//        String key = indexByUserName.get(name);
//        return users.get(key);
//    }
//
//    @Override
//    public User getById(String id) {
//        String index = indexByUserName.get(id);
//        return users.get(index);
//    }
//
//    @Override
//    public void delete(String id) {
//
//    }
}
