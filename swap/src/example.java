public class example {
    int a =10;
    void swapref(example eg){
        eg.a =eg.a+10;
    }
    public static void main(String[] args) {
        example eg =new example();
        System.out.println("Before pass_by_reference " +eg.a);
        eg.swapref(eg);
        System.out.println("After pass_by_reference " +eg.a);
    }
}