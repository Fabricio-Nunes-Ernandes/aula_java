// Declaração da classe
//sout
//psvm

public class Main {
    public static void main(String[] args) {

        // var batata = 1;
        
        // Todos são tipos primitivos 
        // Tipos inteiros
        byte umByte = 1;
        short umShort = 1;
        int inteiro = 1;
        long inteiroMaior = 1L; // tem que ter L

        // Tipos reais
        float umFloat = 1.1f; // tem que ter f
        double umDouble =1.1;
        
        
        char umChar = 'A';
        boolean umBoolean = false;
        
        
        //Inteiro Wrapper (deixa colocar null)
        Byte wByte = 1;
        Short wShort = 1;
        Integer wInteger = 1;
        Long wLong = 1L;
        
        Float wFloat = 1.1f;
        Double wDouble = 1.1;
        
        Character wCharacter = 'W';
        Boolean wBoolean = null;
        
        String texto = "Hello world!!!";

        int numero1 = 1;
        int numero2 = 1;

        String texto1 = "Texto";
        String texto2 = "Texto";

      // Comparar numero
        boolean teste = numero1 == numero2;

        // Comparar texto
        boolean teste2 = texto1.equals(texto2);

        System.out.println(teste);
        System.out.println(teste2);


       // char charNumero = 65;
        char charNumero = '\u0000';

        System.out.println(charNumero);


    }

}
