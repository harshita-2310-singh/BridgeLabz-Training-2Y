class ExceptionPropagationDemo {

    public void methodB() {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            String s = null;
            System.out.println(s.length());
        } catch (NumberFormatException e) {
            System.out.println("Caught in methodB: NumberFormatException");
        }
    }

    public void methodA() {
        try {
            methodB();
        } catch (NullPointerException e) {
            System.out.println("Caught in methodA: NullPointerException");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationDemo demo = new ExceptionPropagationDemo();
        demo.methodA();
        System.out.println("Program continues normally.");
    }
}
