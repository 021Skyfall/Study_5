public class Main {
    public static void main(String[] args) {
        Phone i = new Phone("iphone","space blue","010-5555-5555");
        // 얘는 클래스 안에 필드(객체)를 정의
        System.out.println(String.format("내 폰은 %s고 %s색이야, 전화번호는 %s야.",i.model,i.color,i.number));

        // 얘는 클래스의 동작(객체)을 정의한 거 ~> 메소드
        i.any();
        i.thing();
        System.out.println();

        // 얘는 객체에서 필드만 정의하고 메소드는 넣지 않음
        student A = new student(); // student 클래스의 복제 인스턴스 생성
        A.firstName = "James";
        A.lastName = "Lee";
        A.age = 25;
        A.major = "ComputerScience";
        A.grade = 4.2;
        A.graduate = false;

        student B = new student();
        B.firstName = "Luka";
        B.lastName = "Modrich";
        B.age = 29;
        B.major = "ComputerScience";
        B.grade = 3.7;
        B.graduate = true;

        student C = new student();
        C.firstName = "Geon";
        C.lastName = "Ko";
        C.age = 28;
        C.major = "Christ";
        C.grade = 2.9;
        C.graduate = false;

        int cost = 100000;

        if(B.major == C.major) {
            cost -= cost * 0.2;
            System.out.println(String.format("할인된 금액은 %d입니다.",cost));
        } else {
            System.out.println(String.format("전공이 %s이어야 합니다",A.major));
        }

        // 직접 해보니까 용어랑 용법 엄청 헷갈리긴하네
    }
}