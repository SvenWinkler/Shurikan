package org.jedev.domain;

/**
 * A product is encapsulates the development.
 * So a product has a team which develops it.
 * It should have a backlog, so we know what to do.
 *
 * Maybe - later on - we are able to link different products together and integrate their backlogs.
 *
 * So far that's it...
 *
 * Created by svnwnk on 24/05/14.
 */
public class Product {

	private String name;
	private String description;
	private ProductConfiguration config;

	private InputQueue inputQueue;
	private Team team;
}
