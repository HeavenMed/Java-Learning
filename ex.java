
import java.util.Scanner; // importando
public class ex {

     static void Fatorial(int x){
        for( int k = x-1 ; k >= 1 ; k--){
            x = x*k;
        }
        System.out.println(x);

    }

    public static void main(String[] args){

       Fatorial(3);


     }

    
}
