class testing {
    public void method1() {
        System.out.println("Hello World");
    }

    public void method2() {
        System.out.println("Hello");
    }
}

class testing2 extends testing {

    public void method3() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        testing2 t = new testing2();
        t.method1();
        t.method2();
        t.method3();
    }
}

