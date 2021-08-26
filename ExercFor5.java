public class ExercFor5{
    public void par_impar(){
/*5. (opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é impar, x = 3 * x + 1
imprime x
x= int System.out.println(INPUT("Escreva um número: "+  )*/
	int x = 57;
    if (x % 2 ==0){  //resto(%) da divisão for par
        x = x / 2;
    //System.out.println("Valor de x: "+x);//--> nao precisa deste print
    }
    else{
    x = 3 * x + 1;
    System.out.println("Valor de x: "+x);					
    }	
    }
    } 