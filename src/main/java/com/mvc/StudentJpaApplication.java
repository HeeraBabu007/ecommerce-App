package com.mvc;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mvc.springboot.rest.model.Gender;
import com.mvc.springboot.rest.model.User;
import com.mvc.springboot.rest.model.UserProfile;
import com.mvc.springboot.rest.repository.UserProfileRepository;
import com.mvc.springboot.rest.repository.UserRepository;

@SpringBootApplication
public class StudentJpaApplication implements CommandLineRunner {

	@Autowired
    private UserRepository userRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(StudentJpaApplication.class, args);
	}
	
	
	@Override
    public void run(String... args) throws Exception {
		System.out.print("*****************************************BABU");
        // Clean up database tables
        userProfileRepository.deleteAllInBatch();
        userRepository.deleteAllInBatch();

        //=========================================

        // Create a User instance
        User user = new User("Navneet", "Kaur", "Navneet@ps.com",
                "MYSECRET_PASSWORD");

        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1992, 7, 21);

        // Create a UserProfile instance
        UserProfile userProfile = new UserProfile("+91-9898989898", Gender.FEMALE, dateOfBirth.getTime(),
                "220", "4th Cross", "TCH college Road Nagavara", "Bangalore",
                "Karnataka", "India", "560045");


        // Set child reference(userProfile) in parent entity(user)
        user.setUserProfile(userProfile);

        // Set parent reference(user) in child entity(userProfile)
        userProfile.setUser(user);

        // Save Parent Reference (which will save the child as well)
        userRepository.save(user);

}
}