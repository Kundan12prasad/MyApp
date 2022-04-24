package com.practice.springbootmapping;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.springbootmapping.entity.User;
import com.practice.springbootmapping.entity.UserProfile;
import com.practice.springbootmapping.entity.Gender;
import com.practice.springbootmapping.repository.UserRepository;
import com.practice.springbootmapping.repository.UserProfileRepository;

@SpringBootApplication
public class SpringBootOnetoOneMappingApplication implements CommandLineRunner
{
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOnetoOneMappingApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		User user = new User();
		user.setName("Kundan");
		user.setEmail("kundan@gmail.com");
		
	//creating the object of userprofile
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Kolkata");
		userProfile.setBirthOfDate(LocalDate.of(1992, 9, 26));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("1234567899");
		//bidirectional mapping
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
	}

}
