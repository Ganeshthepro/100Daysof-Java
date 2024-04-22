package Day11;

public class searchinstr {
    public static void main(String[] args) {
        String name = "ganesh";
        char k = 'n';
        System.out.println(linearSearch(name, k));
    }

    static boolean linearSearch(String str, char k){
        if(str.length()==0){
            return false;
        }

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==k){
                return true;
            }
        }

        return false;
    }
}
