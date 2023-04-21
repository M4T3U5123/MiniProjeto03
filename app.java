import java.util.Scanner;

class App {
    public static void main(String[] argas) {
    Scanner escaneador = new Scanner(System.in);

    persona robLucci = new persona("Rob Lucci", 100);
    persona luffy = new persona("Luffy", 100);

    //capitulo 01 introdução a história
    capitulos cap1 = new capitulos(
    "Seja bem vindo ao mundo de One Piece, "+
    " agora vc presenciara o fim da luta entre Luffy e Rob Lucci, "+
    " está em suas mãos decidir quem vencera esse confronto. BOA SORTE!!!. \n"+
    "--O Confronto Final! --\n\n",
    "Após receber um golpe em cheio Luffy está no chão sangrado sem forças para se levantar...\n" +
    "Ussop vendo Luffy caido grita para que ele não desista...\n" +
    "Rob lucci sorrir e diz..." +
    "Rob Lucci:-Depois que eu acabar com vc Mugiwara darei um fim em seus companheiros, começando com aquele narigudo ...\n" +
    "após ouvir isso luffy sente que ainda consegue dar um último golpe e tentar vencer essa batalha...\n " +
    "Luffy levantara para dar o último golpe em Rob Lucci?\n",
   new String[]{"sim","nao"},// chamada das escolhas em cada capitulo no main
     luffy, 
     0, 
     escaneador);  

   //capitulo 02 da história
   capitulos cap2 = new capitulos(
      "-- A Última chance!--\n\n",
      "Luffy levanta em fúria...\n" +
      "Ele ativa novamente o seu Gear Second e vai a todo vapor para cima do Rob Lucci.\n" +
      "Quase perdendo a conciencia a ponto de desmaiar, Luffy sabe que esse é seu último golpe...\n" +
      "Qual o Golpe que Luffy deve utilizar para derrotar Rob Lucci?",
     new String[]{"jet gatling", 
     "jet rifle","gear third"}, 
     luffy, 
     -80, 
     escaneador);

     //capitulo 03 da história
     capitulos cap3 = new capitulos(
      "-- O Poder da Determinação!--\n\n",
      "Luffy potencializa ao maximo o seu Gear Second e com suas ultimas energias dispara o seu golpe final...\n" +
      "Luffy:-Gomu Gomu no Jet Gatling Gun\n" +
      "Nisso uma chuva de socos em alta velocidades vão em direção ao Rob Lucci\n" +
      "Rob Lucci Utiliza o seu Tekkai para deixar o seu corpo mais resisten que o ferro e aguentar o dano...\n" +
      "Porém Luffy tomado pela determinação em salvar em protejer os seus companheiros, aumenta mais ainda a potência dos seus socos fazendo assim Rob Lucci não aguentar a pressão receber todos os danos e cair derrotado.\n" +
      "nisso luffy cai sem conseguir se molver, porém saiu vitorioso seus companheiros o resgatam e juntos vão rumo a sua jornadade se tornar o Rei dos Piratas.  ...\n" +
      "FIM!!!\n" +
      "Obrigado por ajudar Luffy em sua jornada!\n",
           null, //caso não tenha escolha fica definido como vazio
           robLucci, 
           -100, 
           escaneador);

           //capitulo 04 da história
           capitulos cap4 = new capitulos(
            "-- Tekkai!--\n\n",
            "Luffy estica e torce sua mão para traz para utilizar seu golpe...\n" +
            "Luffy: - Gomu Gomu no Jet Rifle\n" +
            "nisso um soco muito veloz vai com tudo em dirção ao Rob Lucci... \n" +
            "Porém Rob Lucci utilizou seu Tekkai seu corpo ficou mais resistente que o ferro, fazendo assim o golpe de Luffy não surtir efeito.\n" +
            "Luffy cai exausto sem conseguir se molver, Lucci pega Luffy e o joga no Navío da Marinha.\n" +
            "ápos isso Lucci derrota todos os companheiros de Luffy e os prende.\n" +
            "tazendo assim a vitoria para a Marinha. FIM!!!",               
                null,
                 luffy, 
                 -100, 
                 escaneador);

                //capitulo 05 da história
                 capitulos cap5 = new capitulos(
                  "-- O fim de uma Jornada! --\n\n",
                  "Luffy não levanta.\n" +
                  "Rob Lucci executa Luffy na frente de seu companheiros ...\n" +
                  "Vai atrás do Usopp e o elimina ...\n" +
                  "acaba com a maior parte da tripulação do Luffy\n\n" +
                  "E os que consegue fugir de Enis Lobby desistem de sua jornada. FIM!!!\n",                 
                 null,
                 luffy, 
                 -100, 
                 escaneador);
                
                 //capitulo 06 da história
                 capitulos cap6 = new capitulos(
                  "--O erro Fatal!--\n\n",
                  "Luffy tenta usar seu Gear Third, porém não consegue inflar os seus ossos pela exastão...\n" +
                  "Nisso Rob Lucci agarra Luffy com sua calda e ultiliza seu golpe mais forte...\n" +
                  "Rob Lucci:-Sai Dai Rin:Rokuogan (Anel Máximo: Arma dos Seis Reis)."+
                  "Acabando de ve com Luffy. Fim!!!...",
                   null, 
                   luffy, 
                   -100, 
                   escaneador);

          cap1.mostrarinfo();
          int primeira = cap1.selecao();
          if(primeira == 0){
                cap2.mostrarinfo();
                int segundo = cap2.selecao();
                if( segundo == 0){
                      cap3.mostrarinfo();
                }
                else if( segundo == 1){
                  cap4.mostrarinfo();
            }
            else if( segundo == 2){
                  cap6.mostrarinfo();
            }
                else if(primeira == 0){
                      cap5.mostrarinfo();

                }
          }
                else if (primeira == 1){
                      cap5.mostrarinfo();
                }
                escaneador.close();
          }
          
    }
