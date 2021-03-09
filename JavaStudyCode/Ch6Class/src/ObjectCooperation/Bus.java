package ObjectCooperation;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber; //버스번호를 매개변수로 받는 생성자
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고,  수입은 " + money + "입니다.");
    }
}


