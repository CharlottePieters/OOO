package Domain;

public class RandomCypherAdapter implements Encryptor {
    RandomCypher randomCypher;

    public RandomCypherAdapter(RandomCypher randomCypher){
        this.randomCypher = randomCypher;
    }

    @Override
    public String encrypt(String t) {
        char[]chars = t.toCharArray();
        char[]res = randomCypher.encypher(chars);
        String result = "";
        for (char c : res){
            result += c;
        }
        return result;
    }

    @Override
    public String decrypt(String t) {
        char[]chars = t.toCharArray();
        char[]res = randomCypher.decypher(chars);
        String result = "";
        for (char c : res){
            result += c;
        }
        return result;
    }
}
