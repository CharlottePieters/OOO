package Domain;

public class EncryptorApp implements Encryptor {
    private String text;
    private Encryptor encryptor;
    private Encryptor ceasar = new Ceasar();
    private Encryptor mirror = new Mirror();

    public EncryptorApp(String text, Encryptor encryptor){
        this.text = text;
        this.encryptor = encryptor;
    }

    public EncryptorApp(String text){
        this.text = text;
        this.encryptor = mirror;
    }

    public EncryptorApp(){
        this.text = "test";
        this.encryptor = mirror;
    }

    public void setEncryptor(Encryptor encryptor){

    }

    public void changeEncryptor(Encryptor encryptor){

    }

    @Override
    public String encrypt(String t) {
        return encryptor.encrypt(t);
    }

    @Override
    public String decrypt(String t) {
        return encryptor.decrypt(t);
    }

}
