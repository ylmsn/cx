public class LV0 {
    String Wu;
    String rongQi;
    public static void test (String Wu,String rongQi){
        System.out.println("把"+Wu+"放进"+rongQi);
    }
    static void kaoXiang (String beikaowu){
        System.out.println("烤箱可以烤"+beikaowu);
    }
    static void xiYiJi(String beixiwu){
        System.out.println("洗衣机可以洗"+beixiwu);
    }
    public static void main(String[] args){
        test("大象","冰箱");
        test("大象","洗衣机");
        test("大象","烤箱");
        test("大象","衣柜");
        test("老虎","冰箱");
        test("老虎","衣柜");
        test("猴子","烤箱");
        kaoXiang("大象");
        xiYiJi("老虎" );
    }


}
