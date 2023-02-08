public class ClassMethods {
    static void Correr() {
        System.out.print("Corra!");
    }

    static void Somar() {
        System.out.print("Somei");
    }



    public static void main(String[] args ){
    
    ClassMethods Obj = new ClassMethods();

    Obj.Correr(); // Irá imprmir Corra!

    }
}
