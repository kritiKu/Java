public class ConcatStr {
    public static void main(String[] args) {
        System.out.println(concateString("I","am","learning", "java"));
    }

    public static String concateString(String... strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");

        }
        return sb.toString();
    }
}
