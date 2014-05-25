package org.jedev.domain.backlog;

/**
 * Created by svnwnk on 25/05/14.
 */
public class BacklogItemFactory {

	public static BacklogItem createItem( String itemCode ) {

		BacklogItem item = null;

		if (itemCode.equals( "userStory" )) {

			item = new UserStory();
		}
		else if ( itemCode.equals("bug")){

			item = new Bug();
		}

		return item;
	}

}
