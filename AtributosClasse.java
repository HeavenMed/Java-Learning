public class AtributosClasse {
    int x = 10; // Se colocássemos um final nessa variável, como final int x = 10
    // ela não iria ser mudada lá em baixo , pelo myObj.x = 25

    //The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
    public static void main(String[] args) {
        AtributosClasse myObj = new AtributosClasse();
        myObj.x = 25 + 5; // x is now 25
    System.out.println(myObj.x);



}
}
