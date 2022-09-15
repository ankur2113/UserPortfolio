package com.Reset.PortfolioStarter.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Reset.PortfolioStarter.Entity.User;

public interface PortfolioRepo extends MongoRepository<User, Integer>{

}
