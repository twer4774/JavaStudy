package Object.equals.SelfCoding;

/**
 * 날짜가 같으면
 * System.out.println(date1.equals(date2)));의 출력 결과 값이 true가 되도록 재정의
 */


class MyDate{
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyDate){
            MyDate myDate = (MyDate) obj;
            if(this.day == myDate.day && this.month == myDate.month && this.year == myDate.year){
                return true;
            }
        }
        return false;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(9, 18, 2004);
        MyDate date2 = new MyDate(9, 18, 2004);
        System.out.println(date1.equals(date2));
    }
}
