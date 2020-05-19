package java_20200519;

public class CalendarReview {
	static final int SUN = 0;
	static final int MON = 1;
	static final int TUE = 2;
	static final int WED = 3;
	static final int THU = 4;
	static final int FRI = 5;
	static final int SAT = 6;
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public CalendarReview() {

	}

	private boolean isLeafYear(int year) {
		boolean isLeafYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		return isLeafYear;
	}

	private int getLastDay(int year, int month) {
		if (isLeafYear(year)) {
			monthArray[1] = 29;
		}
		return monthArray[month - 1];
	}

	private int getCount(int year, int month, int day) {
		int totalCount = 0;
		// 변수를 하나 지정해서 이전년도를 구하는 방법으로 해보자!!
		int preYear = year - 1;
		totalCount = ((365 * preYear) + (preYear / 4) - (preYear / 100) + (preYear / 400));
		// monthArray배열에서 year이 윤년인지 판단하고 윤년이면 29일, 아니면 28일로 변경하시오.
		if (isLeafYear(year)) {
			monthArray[1] = 29;
		}
		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}
		totalCount += day;
		return totalCount;
	}

	public void calendar(int year, int month, int day) {
		int totalCount = getCount(year, month, day);
		int dayOfWeek = (totalCount % 7);
		// System.out.println(rest);
		// 나머지의 숫자에 따른 요일을 출력하는 if문 구하기
		String message = null;
		if (dayOfWeek == MON) {
			message = "월요일";
		} else if (dayOfWeek == TUE) {
			message = "화요일";
		} else if (dayOfWeek == WED) {
			message = "수요일";
		} else if (dayOfWeek == THU) {
			message = "목요일";
		} else if (dayOfWeek == FRI) {
			message = "금요일";
		} else if (dayOfWeek == SAT) {
			message = "토요일";
		} else if (dayOfWeek == SUN) {
			message = "일요일";
		}
		// 출력값은 2020년 5월 12일은 00 입니다.
		System.out.println(year + "년 " + month + "월 " + day + "일은  " + message + " 입니다.");

	}

	public void calendar(int year, int month) {
		System.out.printf(" \t\t===%d 년 %d 월===\t\t\t\t%n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int totalCount = getCount(year, month, 1);
		int rest = totalCount % 7;

		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= getLastDay(year, month); i++) {
			System.out.print(i + "\t");
			rest++;
			if (rest % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}

	public void calendar(int year) {

		for (int i = 1; i <= 12; i++) {
			calendar(year, i);
		}
	}

}
