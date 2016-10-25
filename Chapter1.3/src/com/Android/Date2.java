package com.Android;

import java.time.LocalDate;
import java.util.Date;

// you can't 2 packages of the same name , even  if they are in different packages
//import java.sql.Date;
public class Date2 {
	// you can use a simple format to declare a date. ie it is just the DAte.

	Date myDate;

	// if you want to use the 2 dates , you have to use the fully qualified name
	// for one of the data types

	// ie
	java.sql.Date sqlDate;
}
