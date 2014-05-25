package org.jedev.domain;

import org.jedev.domain.backlog.BacklogItem;

import java.util.ArrayList;
import java.util.List;

/**
 * An input queue is a list of items to develop or to do.
 *
 * Concrete representations could be ProductBacklog, TeamBacklog, AreaBacklog, PortfolioBacklog...
 *
 * Created by svnwnk on 24/05/14.
 */
public interface InputQueue {

	List<BacklogItem> backlogItems = new ArrayList<BacklogItem>();
}
