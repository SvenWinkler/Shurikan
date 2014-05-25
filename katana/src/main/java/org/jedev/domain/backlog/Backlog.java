package org.jedev.domain.backlog;

import java.util.ArrayList;
import java.util.List;

/**
 * A backlog is a list of items to develop or to do.
 *
 * Concrete representations could be ProductBacklog, TeamBacklog, AreaBacklog, PortfolioBacklog...
 *
 * Created by svnwnk on 24/05/14.
 */
public interface Backlog {

	List<BacklogItem> backlogItems = new ArrayList<BacklogItem>();
}
