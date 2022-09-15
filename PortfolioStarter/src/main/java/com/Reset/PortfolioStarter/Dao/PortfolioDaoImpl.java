package com.Reset.PortfolioStarter.Dao;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Reset.PortfolioStarter.Entity.User;
import com.Reset.PortfolioStarter.Repository.PortfolioRepo;
import com.Reset.PortfolioStarter.Service.SequenceService;

@Repository("portfolioDao")
public class PortfolioDaoImpl implements PortfolioDao{
	
	@Autowired
	PortfolioRepo prepo;
	
	@Autowired
	SequenceService seqService;

	@Override
	public User saveUser(User user) {
		user.setUiD(seqService.generateSequence(User.SEQUENCE_NAME));
		user = prepo.save(user); 
		return user;
	}

	@Override
	public List<User> getAllUser() {
		return prepo.findAll();
	}

	@Override
	public User getUserById(User user) {
		User u1 = prepo.findById(user.getUiD()).get();
		return u1;
	}

	@Override
	public List<User> deleteUserById(User user) {
		prepo.deleteById(user.getUiD());
		return prepo.findAll();
	}

	@Override
	public Map<String, Long> getGenderOfUser() {
		Map<String, Long> i;
		i=prepo.findAll().stream().collect(Collectors.groupingBy(User::getGender, Collectors.counting()));
		return i;
	}

	@Override
	public Map<String, Double> getMaleFemaleAgeAverage() {
		Map<String, Double> i;
		i=prepo.findAll().stream().collect(Collectors.groupingBy(User::getGender, Collectors.averagingLong(User::getAge)));
		return i;
	}

	@Override
	public Map<String, Double> getMaleFemaleSalaryAverage() {
		Map<String, Double> i;
		i=prepo.findAll().stream().collect(Collectors.groupingBy(User::getGender, Collectors.averagingLong(User::getUphone)));
		return i;
		
	}


}
