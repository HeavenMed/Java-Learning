import java.util.HashMap;

public class hashmapp {
    public static void main(String[] args ){


        HashMap<String , String> cidadeCapital = new HashMap<String , String>();

        cidadeCapital.put("São Paulo" , "São Paulo");
        cidadeCapital.put("Tocantins" , "palmas");

        //Para usar a chave para acessar o value
        String capitalSP = cidadeCapital.get("São Paulo");

        System.out.println(capitalSP); // Printa São Paulo

        //Métodos
        //remove()
        // To remove all items, use the clear() method:
        // To find out how many items there are, use the size() method:
        //Loop through the items of a HashMap with a for-each loop.
        //Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
        //
        //

    }
}
