// package com.tekup.books.services;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.password.PasswordEncoder;

// import com.tekup.books.models.User;
// import com.tekup.books.repository.UserRepository;

// public class registrationService {
//     @Autowired
// private UserRepository userRepository;
// @Autowired
// private PasswordEncoder passwordEncoder;
// public void registerUser(User user) {
//     // user.setPassword(passwordEncoder.encode(user.getPassword()));
//     userRepository.save(user);
// }
// }