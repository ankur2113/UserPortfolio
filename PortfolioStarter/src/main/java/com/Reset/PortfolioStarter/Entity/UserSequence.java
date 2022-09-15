package com.Reset.PortfolioStarter.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserSequenceDB")
public class UserSequence {

	@Id
	private String id;
	private int seq;


    public UserSequence() {
		super();
	}

	@Override
	public String toString() {
		return "UserSequence [id=" + id + ", seq=" + seq + "]";
	}

	public UserSequence(String id, int seq) {
		super();
		this.id = id;
		this.seq = seq;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}
}
