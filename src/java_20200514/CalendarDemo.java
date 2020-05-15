package java_20200514;

public class CalendarDemo {
	public static void main(String[] args) {

		/*
		 * 달력 만들기 1. 1년 1월 1일 월요일 2. 1년은 365일 이고, 윤년일 때는 366일(2월 29일) 3. 윤년은 4년마다 발생하고,
		 * 그중에 100의 배수는 제외하고, 400 배수는 제외하지 않는다. 4. 2020년 5월 12일은 무슨 요일 일까? 5. 2019년까지
		 * 총일수 + 4월까지 총일수 + 12 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일,.....
		 */
		// 총 일수를 먼저 구해보자!!

		int year = 2020;
		int month = 12;
		int day = 25;
		int totalCount = 0;
		int rest = 0;

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

//		totalCount += 31 + 29 + 31 + 30;
		totalCount += day;
		// 2019년 5월12일까지의 총일 수!

		rest = (totalCount % 7);
		System.out.println(rest);

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
