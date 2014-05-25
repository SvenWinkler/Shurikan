package org.jedev.domain.backlog;

import org.jedev.domain.backlog.items.Bug;
import org.jedev.domain.backlog.items.Task;
import org.jedev.domain.backlog.items.TechnicalStory;
import org.jedev.domain.backlog.items.UserStory;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by svnwnk on 25/05/14.
 */
public class BacklogItemFactoryTest {

	@Test( expected = IllegalArgumentException.class)
	public void testWrongCode(){

		BacklogItemFactory.createItem( "thisIsWrong" );
	}

	@Test
	public void testGetUserStory() {

		assertThat(BacklogItemFactory.createItem( "userStory" ), is( instanceOf( UserStory.class )));
	}

	@Test
	public void testGetBug() {

		assertThat( BacklogItemFactory.createItem( "bug"), is( instanceOf( Bug.class )));
	}

	@Test
	public void testGetTechnicalStory(){

		assertThat( BacklogItemFactory.createItem( "techStory" ), is( instanceOf( TechnicalStory.class )));
	}

	@Test
	public void testGetTask() {

		assertThat( BacklogItemFactory.createItem( "task" ), is( instanceOf( Task.class )));
	}
}
