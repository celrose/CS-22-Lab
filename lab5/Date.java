/*
 * mp5 code by rocelle cadavos 9/13/2016
 *
 */

public class Date {
	
	private int year;
	private int month;
	private int day;

	Date(){
		year = 9999;
		month = 1;
		day = 1;
	}
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setYear(int year) {
		if(year < 1 && year > 9999) {
			throw new IllegalArgumentException("Invalid year!");
		} else {
			this.year = year;
		}
	}

	public void setMonth(int month) {
		if(month < 1 && month > 12) {
			throw new IllegalArgumentException("Invalid month!");
		} else {
			switch(month) {
					case 1:
						if(day < 1 && day > 31) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 2:
						if(day < 1 && day > 28) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 3:
						if(day < 1 && day > 31) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 4:
						if(day < 1 && day > 30) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 5:
						if(day < 1 && day > 31) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 6:
						if(day < 1 && day > 30) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 7:
						if(day < 1 && day > 31) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 8:
						if(day < 1 && day > 31) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 9:
						if(day < 1 && day > 30) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 10:
						if(day < 1 && day > 31) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 11:
						if(day < 1 && day > 30) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					case 12:
						if(day < 1 && day > 31) {
							throw new IllegalArgumentException("Invalid day for given month");
						}
						break;
					default:
						//none
				}
			}
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay(){
		return day;
	}

	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return String.format("%d / %d / %d,", this.day, this.month, this.year);
	}

}
