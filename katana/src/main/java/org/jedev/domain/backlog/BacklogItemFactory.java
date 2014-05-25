package org.jedev.domain.backlog;

import org.jedev.domain.backlog.items.*;

/**
 * Factory method to create Backlog Items by code.
 *
 * Created by svnwnk on 25/05/14.
 */
public class BacklogItemFactory {

	/**
	 * ## The Item Creator for Backlog Items
	 *
	 * Creates all possible items identified by given code. It will return:
	 *
	 *  * an UserStory if you pass "userStory"
	 *  * a TechnicalStory if you pass "techStory"
	 *  * a Task if you pass "task"
	 *  * a Bug if you pass "bug"
	 *
	 * Example:
	 *
	 * ```java
	 * BacklogItemFactory.createItem( "bug" );
	 * ```
	 *
	 * @param code the identifier for the type of Backlog Item
	 * @return the created instance of the requested item
	 * @exception throws IllegalArgumentException if no code matches
	 */
	public static BacklogItem createItem( String code ) {

		BacklogItem item = null;

		if (code.equals( "userStory" )) {

			item = new UserStory();
		}
		else if ( code.equals("bug")){

			item = new Bug();
		}
		else if ( code.equals( "techStory" )) {

			item = new TechnicalStory();
		}
		else if ( code.equals( "task" )) {

			item = new Task();
		}
		else {

			throw new IllegalArgumentException( "Cannot find a backlog item type called: " + code );
		}

		return item;
	}

}
