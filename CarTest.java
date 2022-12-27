public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(); // Car 클래스 복제
        Car car2 = new Car(); // 마찬가지로 Car 클래스 복제
// 인스턴스를 수백 수천개를 만들어도 static 키워드가 달린 변수는 값 딱 하나만 공유함
//        System.out.println(car.iV);
//        System.out.println(Car.cV);
//        Car.InstanceMethod(); // 참조 하려면 메모리 어딘가에 인스턴스가 있어야 함
//                                // 즉, 주소값을 모른다는 얘기임
//        Car.ClassMethod();
        car1.cV = "아임 클래수 변수";
        System.out.println(car1.cV);
        System.out.println(car2.cV);
        System.out.println(Car.cV);
        // ~> static이 달린 cV가 위의 car1.cV 값으로 다시 초기화됨

        car1.iV = "아임 인수턴수 변수";
        System.out.println(car1.iV);
        System.out.println(car2.iV);
        // ~> 인스턴스 변수는 클래스 변수와 다르게 참조한 인스턴스만 달라짐
        //그러니까 결국 static이 달린 클래스 변수는 아무리 인스턴스를 많이 만들어도 마지막으로 참조한 값으로 초기화되고
        // 안달린 인스턴스 변수는 각 객체를 복사만 해서 가져온 값을 입력하면 다음 새로 초기화되는 것

        // 맞는 예시인지 모르겠는데
        // 피자 한판을 5명에서 나눠 먹는다고 가정했을 때
        // 한 명이 한 조각을 가져가면 나머지 4명이 봤을 때도 공통적으로 1조각이 가져가진 상태인 게
        // static 클래스 변수고
        // 5명에서 피자를 5판 각 1판씩 먹는다고 하면
        // 한 사람이 자기 피자 한조각 가져가도 다른 사람들 피자는 그대로 인 느낌
    }
}
class Car {
    public String iV = "인스턴스 변수";
    public static String cV = "클래스 변수";

    public static void ClassMethod() {
//        System.out.println(iV); //<< 오류 참조 불가!
        System.out.println(cV);
    }
// 클래스 메서드에서 클래스 변수로 접근 가능
// 클래스 메서드에서 인스턴스 변수로 접근 불가

        public void InstanceMethod() {
            System.out.println(iV);
            System.out.println(cV);
    } // 문제 없음
}
