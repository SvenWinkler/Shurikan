package org.jedev.domain;

import java.math.BigInteger;

/**
 * Created by svnwnk on 24/05/14.
 */
public interface BacklogItem {

	String getName();
	void setName( String name );

	String getDescription();
	void setDescription( String description );

	BigInteger getStackRank();
	void setStackRank( BigInteger stackRank );

}
