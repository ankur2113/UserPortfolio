package com.Reset.PortfolioStarter.Service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Reset.PortfolioStarter.Dao.PortfolioDao;
import com.Reset.PortfolioStarter.Entity.User;

@Service
public class PortfolioService {
	
	@Autowired
	@Qualifier("portfolioDao")
	PortfolioDao pdao;
	
	public User saveUser(User user) {
		return pdao.saveUser(user);
	}

	public List<User> getAllUser() {
		return pdao.getAllUser();
	}

	public User getUserById(User user) {
		return pdao.getUserById(user);
	}

	public List<User> deleteUserById(User user) {
		return pdao.deleteUserById(user);
	}

	public Map<String, Long> getGenderOfUser() {
		return pdao.getGenderOfUser();
	}

	public Map<String, Double> getMaleFemaleAgeAverage() {
		return pdao.getMaleFemaleAgeAverage();
	}

	public Map<String, Double> getMaleFemaleSalaryAverage() {
		return pdao.getMaleFemaleSalaryAverage();
	}

	

	
}
