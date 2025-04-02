import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        System.out.println(toOptinal(null));
        System.out.println(toOptinal(""));
        System.out.println(toOptinal("kriti"));
    }
    public static Optional<String> toOptinal(String str){
        if(str == null || str == ""){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
