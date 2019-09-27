package br.com.thoughtworks.api.util;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public interface IDateHelper {
	
	default String getDayByDate(Calendar date) {
		DateFormatSymbols dfs = DateFormatSymbols.getInstance(Locale.ENGLISH);
		String day = dfs.getWeekdays()[date.get(Calendar.DAY_OF_WEEK)];
		return day;
	}

}
