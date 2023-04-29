public class Test {
    public static void main(String[] args) throws Exception {
        Steel steel = new Steel();
        Sword<Steel> steelSword = new Sword<>();
        System.out.println(steelSword.checkEndurance(steel));
    }
}
