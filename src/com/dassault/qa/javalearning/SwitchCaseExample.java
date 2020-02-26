package com.dassault.qa.javalearning;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		int month = 7;
		System.out.println(getMonthString(month));
		printMonthString(8);

	}

	private static String getMonthString(int m) {
		
		
		switch(m) {
		
		case 1: return "Jan";
		case 2: return "Feb";
		case 3: return "Mar";
		case 4: return "Apr";
		case 5: return "May";
		case 6: return "Jun";
		case 7: return "Jul";
		case 8: return "Aug";
		case 9: return "Sep";
		case 10: return "Oct";
		case 11: return "Nov";
		case 12: return "Dec";
		default: return "Not Found";
			
		}
	}
	
	private static void printMonthString(int month) {
		
		String monthstring = null;
		
		switch(month) {
		
		case 1: monthstring = "Jan"; 
				break;
		case 2: monthstring = "Feb"; 
				break;
		case 3: monthstring = "Mar"; 
				break;
		case 4: monthstring = "Apr"; break;
		case 5: monthstring = "May"; break;
		case 6: monthstring = "Jun"; break;
		case 7: monthstring = "Jul"; break;
		case 8: monthstring = "Aug"; break;
		case 9: monthstring = "Sep"; break;
		case 10: monthstring = "Oct"; break;
		case 11: monthstring = "Nov"; break;
		case 12: monthstring = "Dec"; break;
			
		}
		
		System.out.println(monthstring);
	}

}
