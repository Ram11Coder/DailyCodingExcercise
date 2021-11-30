package numbers;

/**
 * https://practice.geeksforgeeks.org/problems/find-number-of-days-between-two-given-dates5400/1
 * 
 * Given two dates, find total number of days between them.
 * 
 * Input: dt1 = {10, 2, 2014} dt2 = {10, 3, 2015} Output: 393 dt1 represents
 * “10-Feb-2014” and dt2 represents “10-Mar-2015” The difference is 365 + 28
 * Input: dt1 = {10, 2, 2000} dt2 = {10, 3, 2000} Output: 29 Note that 2000 is a
 * leap year Input: dt1 = {10, 2, 2000} dt2 = {10, 2, 2000} Output: 0 Both dates
 * are same Input: dt1 = {1, 2, 2000}; dt2 = {1, 2, 2004}; Output: 1461 Number
 * of days is 365*4 + 1
 */
/**
 * int[] date1 = { 2, 2, 2000 }, date2 = { 30, 1, 2001 } Need to check above
 * testcase
 */

public class DateDiff {

	public static final int TOT_NO_OF_DAYS = 365;

	public static void main(String[] args) {

		int[] date1 = { 2, 2, 2000 }, date2 = { 30, 1, 2001 };
		System.out.println("Total no of days : " + findDiff(date1, date2));
	}

	private static int findDiff(int[] date1, int[] date2) {

		int date = date2[0] - date1[0];
		int month = date2[1] - date1[1];
		int year = date2[2] - date1[2] - 1;

		if (date == 0 && month == 0 && year == 0)
			return 0;
		if (year == -1)
			return getDaysInSameYear(date1[1], date2[1], date1[2], date1[0], date2[0]);
		if (year == 0)
			return ((isLeapYear(date1[2])) ? 1 : 0) + getTotalMonthlyDates(date1[1]) - date1[0]
					+ ((date2[1] == 1) ? date2[0] : (TotalendYearDays(date2[1] - 1) + date2[0]));
		int res = (startYearDays(date1[0], date1[1]) + MidYearDays(date1[2], date2[2], year)
				+ endYearDays(date2[0], date2[1]));
		return res;
	}

	private static int getDaysInSameYear(int startMonth, int endMonth, int year, int date1, int date2) {
		int c = 0, days = 0;
		if (startMonth <= 2 && isLeapYear(year))
			c = 1;
		if (date1 != 1 && date2 != 31)
			days += getMonth(startMonth) - date1 + date2;
		else
			days += getMonth(startMonth) + date2;
		for (int i = startMonth + 1; i < endMonth; i++)
			days += getMonth(i);
		return days + c;
	}

	private static int endYearDays(int day, int month) {
		return (day) + TotalendYearDays(month - 1);
	}

	private static int startYearDays(int day, int month) {
		return (getMonth(month) - day) + (getTotalMonthlyDates(month + 1));
	}

	private static int getTotalMonthlyDates(int month) {
		int i = 0;
		switch (month) {
		case 1: {

			i += 31;
		}
		case 2: {

			i += 28;
		}
		case 3: {

			i += 31;
		}
		case 4: {

			i += 30;
		}
		case 5: {

			i += 31;
		}
		case 6: {

			i += 30;
		}
		case 7: {

			i += 31;
		}
		case 8: {

			i += 31;
		}
		case 9: {

			i += 30;
		}
		case 10: {

			i += 31;
		}
		case 11: {

			i += 30;
		}
		case 12: {

			i += 31;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}
		return i;
	}

	private static int getMonth(int month) {
		switch (month) {
		case 1: {

			return 31;
		}
		case 2: {

			return 28;
		}
		case 3: {

			return 31;
		}
		case 4: {

			return 30;
		}
		case 5: {

			return 31;
		}
		case 6: {

			return 30;
		}
		case 7: {

			return 31;
		}
		case 8: {

			return 31;
		}
		case 9: {

			return 30;
		}
		case 10: {

			return 31;
		}
		case 11: {

			return 30;
		}
		case 12: {

			return 31;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}
	}

	private static int TotalendYearDays(int month) {
		int i = 0;
		switch (month) {

		case 12: {

			i += 31;
		}
		case 11: {

			i += 30;
		}
		case 10: {

			i += 31;
		}
		case 9: {

			i += 30;
		}
		case 8: {

			i += 31;
		}
		case 7: {

			i += 31;
		}
		case 6: {

			i += 30;
		}
		case 5: {

			i += 31;
		}
		case 4: {

			i += 30;
		}
		case 3: {

			i += 31;
		}
		case 2: {

			i += 28;
		}
		case 1: {

			i += 31;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}
		return i;
	}

	private static int MidYearDays(int start, int end, int year) {
		int c = 0;
		int totalDays = TOT_NO_OF_DAYS * year;
		for (int i = start; i < end; i++)
			if (isLeapYear(i))
				c++;
		return c + totalDays;
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 || year % 100 == 0 || year % 400 == 0);
	}
}
