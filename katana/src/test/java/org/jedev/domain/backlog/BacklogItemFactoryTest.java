package org.jedev.domain.backlog;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by svnwnk on 25/05/14.
 */
public class BacklogItemFactoryTest {

	@Test
	public void getUserStory() {

		assertThat(BacklogItemFactory.createItem( "userStory" ), is( instanceOf( UserStory.class )));
	}

	@Test
	public void getBug() {

		assertThat( BacklogItemFactory.createItem( "bug"), is( instanceOf( Bug.class )));
	}
}
