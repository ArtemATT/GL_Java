public class Main {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        System.out.println(myStr.indexOf('a'));
        System.out.println(myStr.lastIndexOf('b'));
        System.out.println(myStr.substring(3, 7));
        System.out.println(reverseString(myStr));
        System.out.println(findUnique(myStr1, myStr2));
        System.out.println(uniqueChars("Using methods of class String"));
    }

    public static String reverseString(String string){
        int strLen = string.length();
        String resStr = "";
        for (int i = strLen-1; i >= 0 ; i--) {
            resStr += string.charAt(i);
        }
        return resStr;
    }
    public static String findUnique(String str1, String str2){
        String resStr = "";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length()-1; i++) {
            if (str2.indexOf(str1.charAt(i)) == -1) {
                resStr += str1.charAt(i);
            }
        }
        return resStr;
    }
    public static char[] uniqueChars(String str){
        str = str.toLowerCase();
        String resStr = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (resStr.indexOf(str.charAt(i)) == -1) {
                resStr += str.charAt(i);
            }
        }

        return resStr.replaceAll("\\s", "").toCharArray();
    }
}
