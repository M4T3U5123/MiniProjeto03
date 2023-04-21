import java.util.Scanner;


public class capitulos {


    String name;
    String text;
    String[] esc; // atributo escolhas da classe capitulo que antes era criado varios atributos para n escolhas
    persona personagem; 
    int alteracaoenergia;
    Scanner input;

   capitulos (String name,
   String text,
   String[] esc, //construtor do array da classe capitulo
   persona personagem,
   int alteracaoenergia,
   Scanner input)
{

    this.name = name;
    this.text = text;
    this.esc = esc;
    this.personagem = personagem; 
    this.alteracaoenergia = alteracaoenergia;
    this.input = input;

}

//metodo mostra da classe capitulo
void mostrarinfo(){

   System.out.println("\n ");
   System.out.println(this.name);
   System.out.println(this.text);
   this.personagem.alterarEnergia(alteracaoenergia);

   // esse if verifica se a escolha está vazio ou não para retornar na chamada
if(this.esc != null) 
{
   for(String escolha : esc){
        System.out.println("-" + escolha);
  
}
}
  System.out.println();
}
//loop de verificação, que caso o resultado seja diferente de nulo ele retorna uma posição do indice 
//escolhido através de uma incrementação
int selecao()
{
    int result = -1;

    if (esc != null)
    {
    while(result == -1)
    {
        System.out.print("Faça escolha: ");
        String recebe = input.nextLine();

        for (int i = 0; i < esc.length; i ++){
            if(recebe.equals(esc[i]))
            {
                result = i;
            }
        }

    }
    System.out.println();
    }
    return result;
  }
}
