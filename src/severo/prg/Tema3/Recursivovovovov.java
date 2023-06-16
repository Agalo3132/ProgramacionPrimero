package severo.prg.Tema3;

public class Recursivovovovov {

    public static int SumSuc(int n){
        int i = 0;
        if (n == 0) {
            return 0;
        } else {
            return n + SumSuc(n-1);
        }
    }

    public static boolean Isp (String str){
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length()-1)){
            return Isp(str.substring(1, str.length()-1));
        } else {
            return false;
        }
    }

    public static void Print(String str){
        if (str.length()<0){
            System.out.println(str.charAt(str.length()-1));
            Print(str.substring(0, str.length()-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(SumSuc(4));
        System.out.println(Isp("ana"));
        Print("hola");
    }

}
