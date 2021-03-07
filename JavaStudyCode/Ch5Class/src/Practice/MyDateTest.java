package Practice;


/**
 * MyDate와 MyDate 클래스 완성
 */

/*
<MyDate 클래스 완성>
- day, month, year 변수는 private로 선언
- 각 변수의 get, set 메소드를 public으로 만듦
- MyDate(int day, int month, int year) 생성자를 만듦
- public boolean isValid() 메소드를 만들어 날짜가 유효한지 확인
- MyDateTest 클래스에서 생성한 MyDate 날짜가 유효한지 확인
*/

class MyDate{
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //윤년이 아닌 달력
    private int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //윤년인 달력
    private int[] daysOfMonthLeaf = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isValid(){
        //윤년인지 아닌지를 결정한 후 해당 달력에 맞는 일수(day)인지 확인 후 유효한지 리턴
        //윤년인 경우
        if(yearOfLeaf(year)){
            //윤년일 경우. 윤년달력 월의 일자와 입력된 일이 유효한지 확인
            if(daysOfMonthLeaf[month-1] >= day && day >= 1){
                System.out.println("유효한 날짜입니다.");
                return true;
            } else {
                //유년일 경우. 유효하지 않음
                System.out.println("유효하지 않은 날짜입니다.");
                return false;
            }
        }
        //윤년이 아닌 경우
        else {
            //배열은 0부터 시작하므로, month-1을 해야 해당 날짜를 불러올 수 있음
            if(daysOfMonth[month-1] >= day && day >= 1){
                System.out.println("유효한 날짜입니다.");
                return true;
            } else {
                //유효하지 않음
                System.out.println("유효하지 않은 날짜입니다.");
                return false;
            }
        }
    }


    /**
     * 윤년 구하는 메소드
     * @param year
     * @return 윤년인지 아닌지 boolean 값으로 리턴
     */
    public boolean yearOfLeaf(int year){

        /*
        * 윤년 => (4로 나누어 떨어지지만 100으로는 나누어 떨어지지 않거나) || 400으로 나누어 떨어지는 년도
        * */
        if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)){
            return true;
        }

        return false;
    }
}


public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isValid()); //거짓

        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isValid()); //참

        /***** 추가 테스트 *****/
        MyDate date3 = new MyDate(31, 4, 2006);
        System.out.println(date3.isValid()); //거짓

        //2008년은 윤년
        MyDate date4 = new MyDate(29, 2, 2008);
        System.out.println(date4.isValid()); //참
    }
}
