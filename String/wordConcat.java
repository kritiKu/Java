public class wordConcat {
    public static void main(String[] args){
        String[] words = {"Hello", ",", "my", "name", "is", "Kriti"};

        StringBuilder sb = new StringBuilder();
        for(String str : words){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
