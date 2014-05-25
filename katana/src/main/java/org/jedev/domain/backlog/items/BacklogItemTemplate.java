package org.jedev.domain.backlog.items;

import org.jedev.domain.backlog.BacklogItem;
import org.jedev.util.TimeTrackable;
import org.joda.time.DateTime;
import java.math.BigInteger;

/**
 * This template provides all standard attribute getters and setters for backlog items.
 *
 * Created by svnwnk on 25/05/14.
 */
public class BacklogItemTemplate implements BacklogItem, TimeTrackable {

	private String name;
	private String description;
	private BigInteger stackRank;

	private DateTime created;
	private DateTime modified;


	@Override
	public String getName() {

		return name;
	}


	@Override
	public void setName( String name ) {

		this.name = name;
	}


	@Override
	public String getDescription() {

		return description;
	}


	@Override
	public void setDescription( String description ) {

		this.description = description;
	}


	@Override
	public BigInteger getStackRank() {

		return stackRank;
	}


	@Override
	public void setStackRank( BigInteger stackRank ) {

		this.stackRank = stackRank;
	}


	@Override
	public DateTime getCreated() {

		return created;
	}


	@Override
	public void setCreated( DateTime created ) {

		this.created = created;
	}


	@Override
	public DateTime getModified() {

		return modified;
	}


	@Override
	public void setModified( DateTime modified ) {

		this.modified = modified;
	}
}
