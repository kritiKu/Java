public class testingCandidate {
    public static void main(String[] args) {
        candidate candidate = num -> {
            for(int i = 2; i<num; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.println(candidate.isCandidate(6));
    }
}
