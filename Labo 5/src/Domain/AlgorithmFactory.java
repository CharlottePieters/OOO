package Domain;

import javax.swing.*;

public class AlgorithmFactory {

    public Encryptor createEncryptor(Algorithm algorithm /*String type, Object... args*/){
        Encryptor encryptor = null;
        /*Class <?> [] arg = new Class[args.length];
        int tel = 0;
        for (Object object:args){
            arg[tel++] = object.getClass();
        }
        try{
            Class<?> clazz = Class.forName(type);
            Constructor<?> constructor = clazz.getConstructor(arg);
            encryptor = (Encryptor) constructor.newInstance(args);
        }
        catch (Exception ex){System.out.println(ex.getMessage());}
        return encryptor;*/

        if (algorithm == Algorithm.CEASAR){
            int key = Integer.parseInt(JOptionPane.showInputDialog("What key would you like to use?"));
            encryptor = new Ceasar(key);
        }
        else if (algorithm == Algorithm.MIRROR){
            encryptor = new Mirror();
        }
        else if (algorithm == Algorithm.RANDOMCYPHER){
            RandomCypher randomCypher = new RandomCypher();
            encryptor = new RandomCypherAdapter(randomCypher);
        }
        return encryptor;
    }
}
