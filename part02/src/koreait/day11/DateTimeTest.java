package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		//현재시간 : ms, ns (1970년 1월 1일 자정을 기준으로 단위마다 카운트 한 것)
		
		//1일, 1년은 각각 몇 ms 일까요? 1초 =1000ms (1ms = 0.001초)
		//1일 = 24시간 * 60분 *60초-> 1초 * 1000 =>result 변수에 저장해 보세요
		int result = 24*60*60*1000;
		System.out.println("1일은 "+result+" ms 입니다");
		System.out.println("1년은 "+result *365L+" ms 입니다");	
		//int 범위 넘어서 overflow  -> Long으로 변환
		
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1일은 "+df.format(result)+" ms 입니다");
		System.out.println("1년은 "+df.format(result*365L)+" ms 입니다");
		//String.format("%15s",df.format(result))으로 하면 자리 정렬 위치를 맞출 수 있다.
	
		
		/*날짜와 시간형식을 다루는 자바클래스를 연습합니다.
			1)java.util.Date 클래스 			-> 구버전 클래스
			2)java.util.Calendar 클래스		-> 구버전 클래스
			3) java 8 버전  java.time.LocalDate(날짜) , LocalTime(시간) , LocalDateTime(날짜와 시간) 클래스
		 	4) java.sql.Date 클래스  - 데이터베이스 다룰 때 사용
		 */
		
		
		//now() 메소드로 현재 시간, 날짜 객체 생성
		LocalDate currentDate = LocalDate.now();		//static 메소드로 객체를 생성	
		System.out.println("날짜 확인 : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("시간 확인 : "+currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("날짜와 시간 확인 : "+current);
		

		//of() 메소드로 특정 시간 및 날짜 객체 생성
		LocalDate mybirthday = LocalDate.of(2001, 12, 6);
		System.out.println("내 탄신일 확인   :"+mybirthday);
		
		LocalTime mybirth_time = LocalTime.of(18, 10);
		System.out.println("내 탄생 시간 : "+mybirth_time);
		
		
		//새 버전 클래스는 날짜 사이의 간격 계산 클래스가 있음. > Period.betwwwn (내가 태어난지 몇년? 몇달? 며칠?)
		Period between = Period.between(mybirthday, currentDate);
		System.out.println("    "+between.getYears() +" 년(years)");
		System.out.println("    "+between.getMonths() +" 월(months)");
		System.out.println("    "+between.getDays() +" 일(days)");
	
		//태어난지 며칠 ?
		System.out.println("내가 태어난 지  : "+ChronoUnit.DAYS.between(mybirthday, currentDate)+"일 지났습니다.");
		
		//Duration 클래스
		//ChronoUnit 클래스
		
	}
	

}
