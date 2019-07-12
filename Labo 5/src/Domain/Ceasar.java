package Domain;

public class Ceasar implements Encryptor{
    private int key;

    public Ceasar(int key) {
        this.setKey(key);
    }

    public Ceasar() { this.setKey(13);}

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey(){
        return this.key;
    }

    @Override
    public String encrypt(String t) {
        char ch;
        String result = "";
        for(int i = 0; i < t.length(); ++i){
            ch = t.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + this.key);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }

                result += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + this.key);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                result += ch;
            }
            else {
                result += ch;
            }
        }
        return result;
    }

    @Override
    public String decrypt(String t) {
        char ch;
        String result = "";
        for(int i = 0; i < t.length(); ++i) {
            ch = t.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - this.key);

                if (ch < 'a') {
                    ch = (char) (ch + 'z' - 'a' + 1);
                }

                result += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - this.key);

                if (ch < 'A') {
                    ch = (char) (ch + 'Z' - 'A' + 1);
                }

                result += ch;
            } else {
                result += ch;
            }
        }
        return result;
    }
}