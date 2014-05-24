package org.jedev.domain;

import java.math.BigInteger;

/**
 * Created by svnwnk on 24/05/14.
 */
public class UserStory implements BacklogItem {

	private String name;
	private String description;
	private BigInteger stackRank;



	public String getName() {

		return name;
	}


	public void setName( String name ) {

		this.name = name;
	}


	public BigInteger getStackRank() {

		return stackRank;
	}


	public void setStackRank( BigInteger stackRank ) {

		this.stackRank = stackRank;
	}


	public String getDescription() {

		return description;
	}


	public void setDescription( String description ) {

		this.description = description;
	}
}
