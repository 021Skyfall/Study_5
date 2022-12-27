public class examField {
    public static void main(String[] args) {
        StaticExam staticExam1 = new StaticExam();
        StaticExam staticExam2 = new StaticExam();
        // 인스턴스 생성 ~> 힙 메모리에 이름이 StaticExam인 클래스를 불러와 복제 후 이름 붙인거
        
        staticExam1.num1 = 100;
        staticExam2.num1 = 1000;

        System.out.println(staticExam1.num1);
        System.out.println(staticExam2.num1);
        // 인스턴스 변수는 생성될 때마다 값을 메모리에 저장하기 때문에 따로 출력

        staticExam1.num2 = 150;
        staticExam2.num2 = 1500;
        System.out.println(staticExam1.num2);
        System.out.println(staticExam2.num2);
        // 1500 두 번 출력 ~> static 키워드는 모든 인스턴스에 공통적으로 적용되는 값 공유
        // 즉 가장 마지막으로 입력한 값이 저장되서 공유됨

    }
}
    class StaticExam {
        int num1 = 10;
        static int num2 = 15;
    }

