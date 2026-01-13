
public class Arrays {
    public static void main(String... args) {
    //define vector, ONEDIMENSIONAL array, and it's size
       int numeros [] = new int[8];

    //assign values to each position of the array
        numeros[0] = 5;
        numeros[1] = 10;
        numeros[2] = 15;
        numeros[3] = 20;
        numeros[4] = 25;
        numeros[5] = 30;
        numeros[6] = 35;
        numeros[7] = 40;
      
    //print each value of the array
        for(int num: numeros){
            System.out.println(num);
        }
    }
}
