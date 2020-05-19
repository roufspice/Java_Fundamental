package java_20200518;

public class Calendar {
	private int year;
	private int month;
	private int day;


	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void set(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private int getCount() {
		int totalCount = 0;
		// 변수를 하나 지정해서 이전년도를 구하는 방법으로 해보자!!
		int preYear = year - 1;
		totalCount = ((365 * preYear) + (preYear / 4) - (preYear / 100) + (preYear / 400));

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// monthArray배열에서 year이 윤년인지 판단하고 윤년이면 29일, 아니면 28일로 변경하시오.
		boolean isLeafYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

		if (isLeafYear) {
			monthArray[1] = 29;

		}
		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}

		totalCount += day;

		return totalCount;

	}

	// 사용자들에게 공개해주는 기능
	public void print() {
		int totalCount = getCount();
		int rest = (totalCount % 7);
		//System.out.println(rest);
		// 나머지의 숫자에 따른 요일을 출력하는 if문 구하기
		String message = null;
		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else if (rest == 0) {
			message = "일요일";
		}
		// 출력값은 2020년 5월 12일은 00 입니다.
		System.out.println(year + "년 " + month + "월 " + day + "일은  " + message + " 입니다.");

	}

}
