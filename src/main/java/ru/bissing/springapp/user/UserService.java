package ru.bissing.springapp.user;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public List<User> listAll() {
        return (List<User>) userRepository.findAll();
    }

    public User get(Long id) {
        return userRepository.findById(id).get();
    }

    public void delete(Long id) {
        userRepository.findById(id);
    }
}
