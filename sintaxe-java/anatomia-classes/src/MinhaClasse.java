public class MinhaClasse {

  public static void main(String[] args) {



    System.out.println("hello world");

    int ano = 2021;

    ano = 2022;

    final String BR = "Brasil"; // Create a constant, so I cant reasign it

    // BR = "Brazil";


    String meuNome = "Matheus";

    int anoNascimento = 1995;

    boolean verdade = true;


    String primeiroNome = "Matheus";
    String segundoNome = "Fernandes";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
  }


  

  public static String nomeCompleto (String primeiroNome, String segundoNome){
    
    return primeiroNome.concat(" ").concat(segundoNome);
  }



}
