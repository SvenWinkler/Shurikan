package org.jedev.domain.backlog;

import java.math.BigInteger;

/**
 * A backlog item is any kind of item put to the list == backlog.
 * We think about UserStories, Technical Issues or Technical Stories,
 * Tasks, Sub Tasks, Bugs, Feature, Theme, Epic, whatever...
 *
 * Maybe we need some generic items later on.
 *
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
