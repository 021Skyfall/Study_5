public class MethodOverloading {
    public static void main(String[] args) {
        idontLikeMath no = new idontLikeMath();
        no.math();
        no.math(7);
        no.math(5,7);
        no.math(10,20,30);
    }
}
class idontLikeMath {
    void math () {
        System.out.println("Something like math");
    }
    void math (double a) {
        System.out.println(Math.sqrt(a));
    }
    void math (double b, double c) {
        System.out.println(Math.sqrt(b)*Math.sqrt(c));
    }
    void math (double z, double x, double y) {
        System.out.println(Math.abs(z)+Math.abs(x)*Math.abs(y));
    }
}
// 메소드 오버로딩
//  1. 같은 이름의 메서드명
//  2. 매개변수의 개수나 타입이 다르게 정의되어야함
