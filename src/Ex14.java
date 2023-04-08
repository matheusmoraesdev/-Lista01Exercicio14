import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) throws Exception {
        double peso;
        double excesso = 50;
        double multa = 4.00;
    Scanner reader = new Scanner(System.in);
        System.out.print("Digite o peso em KG: ");
            peso = reader.nextDouble();
            reader.close();
        
    if (peso > 50) {
        excesso = peso - 50;
        multa = excesso * 4;
        System.out.println("O peso de seus peixes extrapolou o limite em KGs e você deverá pagar uma multa de: R$ " + multa);
    } else {
        System.out.println("Você não precisa pagar multa!");
    }
    }
}
