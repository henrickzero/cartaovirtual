package br.com.dataprev.cartaov.impl.user;


import br.com.dataprev.cartaov.impl.user.model.User;
import br.com.dataprev.cartaov.impl.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    @Autowired
//    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepository.save(user);
        return null;
    }

    public User authenticateUser(String email, String password) {
//        User user = userRepository.findByEmail(email);
//        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
////            user.setPassword("XXXXXXXXXXXX");
////            return user;
////        }
        return null;
    }
}