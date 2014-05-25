package org.jedev.util;

import org.joda.time.DateTime;

/**
 * Could be used for all domain objects which need time tracking due to created and modified.
 *
 * Created by svnwnk on 25/05/14.
 */
public interface TimeTrackable {

	DateTime getCreated();
	void setCreated( DateTime created );
	DateTime getModified();
	void setModified( DateTime modified );
}
