package edu.virginia.cs4720.scavenger;

import android.provider.BaseColumns;

/**
 * Created by danielfmace on 9/22/15.
 */


public final class EventContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public EventContract() {}

    /* Inner class that defines the table contents */
    public static abstract class EventEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
    }
}
