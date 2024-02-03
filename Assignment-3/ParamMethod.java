public class ParamMethod {
    public void printingParams(int a) {
        System.out.println("Parameter passed: " + a);
    }

    public static void main(String[] args) {
        ParamMethod paramMethodObject = new ParamMethod();
        paramMethodObject.printingParams(10);
    }
}
