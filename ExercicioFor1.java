// Exercicio For de 1 até 5
public class ExercicioFor1{
    public static void main (String args[]){
        /*int n=0;
        for (n=150; n<=300; n++){
//1. Imprimir todos os números de 150 a 300
            System.out.println(n);
        }
//2. Imprima a soma de 1 até 1000.
        int n2=0, soma=0;

        for (n2=0; n2<=1000; n2++){
            soma= n2+1;
            soma--;
            System.out.println("Soma = "+soma);
        }
//3. Imprima todos os múltiplos de 3, entre 1 e 100.
        int n3=0, mult=0;
        for (n3=0; n3<=100; n3++){
            if (n3 % 3 == 0){
            System.out.println(n3);
            }
            }*/
//4. Imprima os fatoriais de 1 a 10. 
    int fat=0, n4=0, n=0, num=1;
     for (n4=1; n4<=10; n4++){
         fat=n4*(n4-1);                
             System.out.println("Valores fatoriais de 1 a 10:\n "+fat);
         }
    }

}
/*


5. (opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é impar, x = 3 * x + 1
imprime x8*/