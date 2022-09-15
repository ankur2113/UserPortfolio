package com.Reset.PortfolioStarter.Dao;

import java.util.List;
import java.util.Map;
import com.Reset.PortfolioStarter.Entity.User;

public interface PortfolioDao {

	User saveUser(User user);

	List<User> getAllUser();

	User getUserById(User user);

	List<User> deleteUserById(User user);

	Map<String, Long> getGenderOfUser();

	Map<String, Double> getMaleFemaleAgeAverage();

	Map<String, Double> getMaleFemaleSalaryAverage();

}
