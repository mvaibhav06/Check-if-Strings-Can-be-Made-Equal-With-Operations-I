import java.util.Arrays;

public class EqualStrings {
    public static boolean canBeEqual(String s1, String s2) {
        String o1 = "";
        String e1 = "";
        String o2 = "";
        String e2 = "";

        for(int i=0; i<s1.length(); i++){
            if(i%2 == 0){
                e1 += s1.charAt(i) + "";
            }else{
                o1 += s1.charAt(i) + "";
            }
        }
        for(int i=0; i<s2.length(); i++){
            if(i%2 == 0){
                e2 += s2.charAt(i) + "";
            }else{
                o2 += s2.charAt(i) + "";
            }
        }

        char[] odd1 = o1.toCharArray();
        char[] odd2 = o2.toCharArray();

        Arrays.sort(odd1);
        Arrays.sort(odd2);

        o1 = new String(odd1);
        o2 = new String(odd2);

        if(!o1.equals(o2)) return false;

        char[] even1 = e1.toCharArray();
        char[] even2 = e2.toCharArray();

        Arrays.sort(even1);
        Arrays.sort(even2);

        e1 = new String(even1);
        e2 = new String(even2);

        if(!e1.equals(e2)) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canBeEqual("ekyt","fkit"));
    }
}
