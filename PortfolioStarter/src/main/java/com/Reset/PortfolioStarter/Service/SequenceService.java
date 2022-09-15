package com.Reset.PortfolioStarter.Service;

import java.util.Objects;
import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.Reset.PortfolioStarter.Entity.UserSequence;

@Service
public class SequenceService {
	private MongoOperations mongoOperations;
	
	@Autowired
    public SequenceService(MongoOperations mongoOperation) {
         this.mongoOperations = mongoOperation;
    }
	
	public int generateSequence(String seqName) {

        UserSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
                new Update().inc("seq",1), options().returnNew(true).upsert(true),
                UserSequence.class);
        return !Objects.isNull(counter) ? counter.getSeq() : 1;

    }

}
