package java_class;

public class SeparateCollection {
	//String neighborhood;
	//String type;
	private String day;     //무슨요일인지 입력하면
	//String collectDate; 
	
	
	
	public void setDay(String day) {
		this.day = day;
	}
	public String getDay() {
		return day;
	}
	
	
	//오늘이 분리수거날인지 아닌지 알려준다.
	public boolean isCollectDay() {
		if(day == "월요일" || day == "수요일" || day == "금요일" ) {
			System.out.printf("오늘 %s(은)는 분리수거하는날입니다! %n", day);
			System.out.printf("'일반쓰레기', '음식물쓰레기'는 '14'시 이후, '재활용쓰레기'는 '18'시 이후에 수거합니다.%n");
			System.out.println("감사합니다");
			System.out.println("========");
			boolean result = true;
			return result;
		} else {
			System.out.printf("오늘 %s(은)는 분리수거하는날이 아닙니다!%n", day);
			System.out.printf("매주 월,수,금에 생활쓰레기를 배출해주세요!%n");
			System.out.println("감사합니다");
			System.out.println("========");
			boolean result = false;
			return result;
		}
		
	}
	
	
		
	}
	
	
	

