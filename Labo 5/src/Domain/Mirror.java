package Domain;

public class Mirror implements Encryptor{

    public Mirror(){

    }

    @Override
    public String encrypt(String t) {
        char[]text = t.toCharArray();
        String result = "";
        for (int i = t.length()-1; i >= 0; i--){
            result += text[i];
        }
        return result;
    }

    @Override
    public String decrypt(String t) {
        char[]text = t.toCharArray();
        String result = "";
        for (int i = t.length()-1; i >= 0; i--){
            result += text[i];
        }
        return result;
    }
}
