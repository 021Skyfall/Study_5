class someThing {

    void printSome() {
        System.out.println("heeeeeeellllllllllo");
    }
    int getHeight() {
        return Integer.parseInt("180");
    }
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }
}

public class MethodExam {
    public static void main(String[] args) {
        someThing some = new someThing();
        System.out.println(some.getHeight());
        some.printSome();
        System.out.println(some.plus(1,2));

        printH();
        System.out.println(getAge());
        System.out.println(getJob("not hired"));
        // 왜 같은 클래스 안의 메서드인데 class 변수로 선언하라 그러지?
        // 원래 그런건가?
        // 아 같은 클래스 내에서도 인스턴스 생성 안하면 static 붙여서 호출해야함
        // 대신 인스턴스 생성 안하고 클래스 이름도 안붙여도뎀
        // 바깥 애들은 메인 클래스 안에 인스턴스 만들고 static 안붙이고 인스턴스 변수로 부르면됨
        // static이 필요한 상황이면 걍 static 붙이고 해당 클래스 이름 불러오면뎀
    }

    static void printH() {
        System.out.println("아모고토 모타죠?");
    }
    static double getAge() {
        return Double.parseDouble("170");
    }
    static boolean getJob(String me) {
        if (me == "Hired") {
            return true;
        }
        return false;
    }
}
