public class fieldExam { // ~> 클래스 영역
    int instanceVariable; // ~> 인스턴스 변수
    static int classVariable; // ~> 클래스 변수(=static 변수, 공유 변수)

    void method() { // ~> 메소드 영역
        int localVariable = 0; // 지역 변수. ~> {}블록 안에서만 유효
    }
}
