public class Substring {
    public static void main(String[] args) {
        String s1="CodingBlocks";
     printAllSubstring(s1);
    }

    public static void printAllSubstring(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
