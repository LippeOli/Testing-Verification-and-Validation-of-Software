//Programa de verificacao se ano é bissexto a partir de uma serie de regras

import java.util.Scanner;

public class Bissexto {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um ano:");
    int ano = sc.nextInt();

    try {
      ehBissexto(ano);
      
    } catch (Exception e) {
      System.out.println("O input deve estar entre 1 e 9999");  
    }
  }


  static void ehBissexto(int ano) throws Exception{
    if(ano < 1 || ano > 9999) {
      throw new Exception("Ano inválido!");
  
    }else if(ano % 400 == 0){
      System.out.println("Bissexto!");
    
    }else if(ano % 4 == 0 && ano <= 1752){
      System.out.println("Bissexto!");
    
    }else if(ano % 100 == 0 ){
      System.out.println("Nao eh Bissexto!");
    
    }else{
      System.out.println("Nao eh Bissexto!");
    
    }
  }
}