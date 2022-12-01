package com.finalproject.finalproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.finalproject.finalproject.entities.Announcements;
import com.finalproject.finalproject.entities.Company;
import com.finalproject.finalproject.entities.Credentials;
import com.finalproject.finalproject.entities.Profile;
import com.finalproject.finalproject.entities.Project;
import com.finalproject.finalproject.entities.Team;
import com.finalproject.finalproject.entities.User;
import com.finalproject.finalproject.repositories.AnnouncementsRepository;
import com.finalproject.finalproject.repositories.CompanyRepository;
import com.finalproject.finalproject.repositories.ProjectRepository;
import com.finalproject.finalproject.repositories.TeamRepository;
import com.finalproject.finalproject.repositories.UserRepository;

import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class Seeder implements CommandLineRunner {
	private final UserRepository userRepository;
	private final CompanyRepository companyRepository;
	private final TeamRepository teamRepository;
	private final AnnouncementsRepository announcementRepository;
	private final ProjectRepository projectRepository;

	@Override
	public void run(String... args) throws Exception {
		// Company1
		Company company1 = new Company();
		company1.setName("Jason LLC");
		company1.setDescription("Fact finding at it's best");
		companyRepository.saveAndFlush(company1);
		// Company2
		Company company2 = new Company();
		company2.setName("Alex LLC");
		company2.setDescription("Let's solve problems");
		companyRepository.saveAndFlush(company2);
		// team
		Team team5 = new Team();
		team5.setName("Winners");
		team5.setCompany(company2);
		team5.setDescription("The cleaners");
		Team team4 = new Team();
		team4.setName("Team 4");
		team4.setCompany(company1);
		team4.setDescription("We can do better");
		Team team7 = new Team();
		team7.setName("Movers");
		team7.setCompany(company2);
		team7.setDescription("Okay! what next?");
		Team team6 = new Team();
		team6.setName("Money team");
		team6.setCompany(company1);
		team6.setDescription("We can be rich");
		teamRepository.saveAndFlush(team5);
		teamRepository.saveAndFlush(team4);
		teamRepository.saveAndFlush(team7);
		teamRepository.saveAndFlush(team6);
		// USER1
		// Credentials
		Credentials user1Credentials = new Credentials();
		user1Credentials.setUsername("Lysette123");
		user1Credentials.setPassword("Password");
		User user1 = new User();
		user1.setCredentials(user1Credentials);
		// Profile
		Profile user1Pro = new Profile();
		user1Pro.setFirstName("Lysette");
		user1Pro.setLastName("Swan");
		user1Pro.setEmail("seemenow@gmail.com");
		user1Pro.setPhone("123-456-7890");
		user1.setProfile(user1Pro);
		user1.setCompany(company2);
		user1.setTeam(team6);
		user1.setAdmin(true);
		user1.setStatus("Away");
		// USER2
		// Credentials
		Credentials user2Credentials = new Credentials();
		user2Credentials.setUsername("Alexis");
		user2Credentials.setPassword("Password");
		User user2 = new User();
		user2.setCredentials(user2Credentials);
		// Profile
		Profile user2Pro = new Profile();
		user2Pro.setFirstName("Alex");
		user2Pro.setLastName("Yes");
		user2Pro.setEmail("moneyman@gmail.com");
		user2Pro.setPhone("124-456-7890");
		user2.setProfile(user2Pro);
		user2.setCompany(company2);
		user2.setTeam(team7);
		user2.setAdmin(false);
		user2.setStatus("Busy");
		// USER3
		// Credentials
		Credentials user3Credentials = new Credentials();
		user3Credentials.setUsername("jasonl");
		user3Credentials.setPassword("Password");
		User user3 = new User();
		user3.setCredentials(user3Credentials);
		// Profile
		Profile user3Pro = new Profile();
		user3Pro.setFirstName("Jason");
		user3Pro.setLastName("Luedeking");
		user3Pro.setEmail("jasonL@gmail.com");
		user3Pro.setPhone("125-456-7890");
		user3.setProfile(user3Pro);
		user3.setCompany(company1);
		user3.setTeam(team7);
		user3.setAdmin(false);
		user3.setStatus("unavailable");
		// USER4
		// Credentials
		Credentials user4Credentials = new Credentials();
		user4Credentials.setUsername("jasonk");
		user4Credentials.setPassword("Password");
		User user4 = new User();
		user4.setCredentials(user4Credentials);
		// Profile
		Profile user4Pro = new Profile();
		user4Pro.setFirstName("Jason");
		user4Pro.setLastName("King");
		user4Pro.setEmail("jasonk@gmail.com");
		user4Pro.setPhone("126-456-7890");
		user4.setProfile(user4Pro);
		user4.setCompany(company1);
		user4.setTeam(team4);
		user4.setAdmin(false);
		user4.setStatus("unavailable");
		// USER5
		// Credentials
		Credentials user5Credentials = new Credentials();
		user5Credentials.setUsername("Frankyyy");
		user5Credentials.setPassword("Password");
		User user5 = new User();
		user5.setCredentials(user5Credentials);
		// Profile
		Profile user5Pro = new Profile();
		user5Pro.setFirstName("Frank");
		user5Pro.setLastName("Yankee");
		user5Pro.setEmail("frankyakee@gmail.com");
		user5Pro.setPhone("127-456-7890");
		user5.setProfile(user5Pro);
		user5.setCompany(company2);
		user5.setTeam(team6);
		user5.setAdmin(false);
		user5.setStatus("unavailable");
		// USER6
		// Credentials
		Credentials user6Credentials = new Credentials();
		user6Credentials.setUsername("Dequany");
		user6Credentials.setPassword("Password");
		User user6 = new User();
		user6.setCredentials(user6Credentials);
		// Profile
		Profile user6Pro = new Profile();
		user6Pro.setFirstName("Dequan");
		user6Pro.setLastName("Yes");
		user6Pro.setEmail("dequany@gmail.com");
		user6Pro.setPhone("134-456-7890");
		user6.setProfile(user6Pro);
		user6.setCompany(company2);
		user6.setTeam(team4);
		user6.setAdmin(true);
		user6.setStatus("available");
		// USER7
		// Credentials
		Credentials user7Credentials = new Credentials();
		user7Credentials.setUsername("Zachyes2");
		user7Credentials.setPassword("Password");
		User user7 = new User();
		user7.setCredentials(user7Credentials);
		// Profile
		Profile user7Pro = new Profile();
		user7Pro.setFirstName("Zach");
		user7Pro.setLastName("Yes");
		user7Pro.setEmail("zachyes@gmail.com");
		user7Pro.setPhone("132-456-7890");
		user7.setProfile(user7Pro);
		user7.setCompany(company1);
		user7.setTeam(team5);
		user7.setAdmin(false);
		user7.setStatus("busy");
		// USER8
		// Credentials
		Credentials user8Credentials = new Credentials();
		user8Credentials.setUsername("tamara123");
		user8Credentials.setPassword("Password");
		User user8 = new User();
		user8.setCredentials(user8Credentials);
		// Profile
		Profile user8Pro = new Profile();
		user8Pro.setFirstName("Zach");
		user8Pro.setLastName("Yesu");
		user8Pro.setEmail("zachyes@gmail.com");
		user8Pro.setPhone("131-456-7890");
		user8.setProfile(user8Pro);
		user8.setCompany(company1);
		user8.setTeam(team5);
		user8.setAdmin(false);
		user8.setStatus("away");
		// USER9
		// Credentials
		Credentials user9Credentials = new Credentials();
		user9Credentials.setUsername("atiko123");
		user9Credentials.setPassword("Password");
		User user9 = new User();
		user9.setCredentials(user9Credentials);
		// Profile
		Profile user9Pro = new Profile();
		user9Pro.setFirstName("atiko");
		user9Pro.setLastName("Tee");
		user9Pro.setEmail("atiko@gmail.com");
		user9Pro.setPhone("129-456-7890");
		user9.setProfile(user9Pro);
		user9.setCompany(company1);
		user9.setTeam(team5);
		user9.setAdmin(false);
		user9.setStatus("away");
		// USER10
		// Credentials
		Credentials user10Credentials = new Credentials();
		user10Credentials.setUsername("atiko1890");
		user10Credentials.setPassword("Password");
		User user10 = new User();
		user10.setCredentials(user10Credentials);
		// Profile
		Profile user10Pro = new Profile();
		user10Pro.setFirstName("atiko");
		user10Pro.setLastName("Tee");
		user10Pro.setEmail("atiko@gmail.com");
		user10Pro.setPhone("129-456-7890");
		user10.setProfile(user10Pro);
		user10.setCompany(company2);
		user10.setTeam(team6);
		user10.setAdmin(true);
		user10.setStatus("busy");
		userRepository.saveAndFlush(user1);
		userRepository.saveAndFlush(user2);
		userRepository.saveAndFlush(user3);
		userRepository.saveAndFlush(user4);
		userRepository.saveAndFlush(user5);
		userRepository.saveAndFlush(user6);
		userRepository.saveAndFlush(user7);
		userRepository.saveAndFlush(user8);
		userRepository.saveAndFlush(user9);
		userRepository.saveAndFlush(user10);
		// add users to teams
		List<User> team4Users = new ArrayList<>();
		team4Users.add(user4);
		team4Users.add(user6);
		List<User> team5Users = new ArrayList<>();
		team5Users.add(user9);
		team5Users.add(user8);
		team5Users.add(user7);
		List<User> team6Users = new ArrayList<>();
		team6Users.add(user10);
		team6Users.add(user5);
		team6Users.add(user1);
		List<User> team7Users = new ArrayList<>();
		team7Users.add(user2);
		team7Users.add(user3);
		// adding projects to teams
		Project project1 = new Project();
		project1.setName("money project");
		project1.setDescription("How to make money");
		project1.setActive(false);
		project1.setTeam(team4);
		projectRepository.saveAndFlush(project1);
		Project project2 = new Project();
		project2.setName("money project again");
		project2.setDescription("How to make money again");
		project2.setActive(true);
		project2.setTeam(team5);
		projectRepository.saveAndFlush(project2);
		Project project3 = new Project();
		project3.setName("Make it rain");
		project3.setDescription("How to make even more money");
		project3.setActive(true);
		project3.setTeam(team6);
		projectRepository.saveAndFlush(project3);
		Project project4 = new Project();
		project4.setName("Make it rain again");
		project4.setDescription("How to make much more money");
		project4.setActive(false);
		project4.setTeam(team7);
		projectRepository.saveAndFlush(project4);

		// --- Announcement 1 ---
		Announcements announcement1 = new Announcements();
		announcement1.setTitle("Announcement 1");
		announcement1.setMessage("Lets make money!");
		announcement1.setCompany(company1);
		announcement1.setAuthor(user1);
		// --- Announcement 2 ---
		Announcements announcement2 = new Announcements();
		announcement2.setTitle("Announcement 2");
		announcement2.setMessage("Lets make MORE money!");
		announcement2.setCompany(company2);
		announcement2.setAuthor(user3);
		// --- Announcement 3 ---
		Announcements announcement3 = new Announcements();
		announcement3.setTitle("Announcement 3");
		announcement3.setMessage("Lets make EVEN MORE money!");
		announcement3.setCompany(company1);
		announcement3.setAuthor(user2);
		announcementRepository.saveAndFlush(announcement1);
		announcementRepository.saveAndFlush(announcement2);
		announcementRepository.saveAndFlush(announcement3);
	}
}