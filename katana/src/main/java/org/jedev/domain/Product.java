package org.jedev.domain;

import org.jedev.domain.backlog.Backlog;

/**
 * A product is encapsulates the development.
 * So a product has a team which develops it.
 * It should have a backlog, so we know what to do.
 *
 * Maybe - later on - we are able to link different products together and integrate their backogs.
 *
 * So far that's it...
 *
 * Created by svnwnk on 24/05/14.
 */
public class Product {

	private String name;
	private String description;

	private Backlog productBacklog;
	private Team team;
}
