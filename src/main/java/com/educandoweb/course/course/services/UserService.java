package com.educandoweb.course.course.services;

import com.educandoweb.course.course.entities.User;
import com.educandoweb.course.course.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public User update(Long id, User user){
        User obj = this.userRepository.getReferenceById(id);
        return userRepository.save(obj);
    }

    public void updateData(){
        userRepository.save();
    }
}
