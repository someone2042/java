public class Tp3Exe6 {
    public static void main(String args[]) {
        String ch1 = new String();
        System.out.println("A - ch1 =:" + ch1 + ":");
        String ch2 = "hello";
        System.out.println("B - ch2 =:" + ch2 + ":");
        String ch3 = new String("bonjour");
        System.out.println("C - ch3 =:" + ch3 + ":");
        String ch4 = new String(ch3);
        System.out.println("D - ch4 =:" + ch4 + ":");
        ch3 = "bonsoir";
        System.out.println("E - ch4 =:" + ch4 + ": ch3 =:" + ch3 + ":");
        ch4 = ch3;
        ch3 = "au revoir";
        System.out.println("F - ch4 =:" + ch4 + ": ch3 =:" + ch3 + ":");
    }
}
