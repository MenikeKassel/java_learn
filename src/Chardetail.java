public class Chardetail {
    public static void main(String[] args){
        System.out.println("hello");
        char a = 98;
        System.out.println(a);
        //在java中，char本质是一个整数，输出时是输出对应的unicode编码
        char b1 = 'a';
        System.out.println((int)b1);
    }
}
