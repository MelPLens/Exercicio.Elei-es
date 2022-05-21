package Listaexercicios;

import java.util.Scanner;

public class eleicoespartido {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); { //inserindo os valores para a votacao
	
	int votospt,votospdt, votospl,votospsdb,votosembranco,votosnulos,votostotal;
    } 
    
    System.out.println("----- URNA -----");
    System.out.println("(13) PT");
    System.out.println("(12) PDT");
    System.out.println("(22) PL");
    System.out.println("(45) PSDB");
    System.out.println("(0) VOTO EM BRANCO");
    System.out.println("(1) VOTO NULO ");
    System.out.println("----------------");
   
    
	
	int voto= ler.nextInt(); // solicitando para o candidato votar
	
	// Comandos para fazer a contagem dos votos
	int votospt=0;
	int votospdt=0;
	int votospl=0;
	int votospsdb=0;
	int votosembranco=0;
	int votosnulos=0;
	int votostotal=0; // para saber quantos votos cada candidato vai receber
	
    while(voto>=0){ // A votacao devera acontecer com votos maiores que zero, se nao ira votar
    
    
    	if(voto==13) { // se o voto for igual a 13 sera computado para o partido PT
        votospt=votospt+1; //o "++" exemplo : 0+1 1+1 = 2 contagem dos votos .
        System.out.println("Seu voto foi computado para o partido PT") ; 
    	
    	}
    	else if(voto==12) { // e se voto for igual a 12
    	votospdt=votospdt+1;	
        System.out.println("Seu voto foi computado para o partido PDT") ;   	  
    
    	}
        else if(voto==22) { // e se voto for igual a 22
        votospl=votospl+1;		
        System.out.println("Seu voto foi computado para o partido PL") ;  
    	
        }
    	else if(voto==45) { // e se voto for igual a 45
    	votospsdb=votospsdb+1;	
        System.out.println("Seu voto foi computado para o partido PSDB") ; 
    	
    	}
    	else if(voto==0) { // e se voto for igual a 0
        votosembranco=votosembranco+1;
        System.out.println("Seu voto foi computado como voto em branco") ;  
    	
    	}
    	else if(voto==1) { // e se voto for igual a 1
    	votosnulos=votosnulos+1;	
        System.out.println("Seu voto foi computado como voto nulo") ;  
    	
    	}
    	else  // se nao for nenhuma dessas opcoes
        System.out.println("Partido incorreto, vote novamente !");
        
    	// se o candidato nao votar em ninguem se nao for igual a 13 ou 12 ou 22 ou 45 ou 0 ou 1 . voto nao sera computado
    	if(voto ==13 || voto ==12 || voto ==22 || voto ==45 || voto ==0 || voto ==1){
    	votostotal++;
        }
	
    	{ System.out.println("vote novamente");// para nao obter votos invalidos imprimimos a mensagem na tela
    	  System.out.println("Digite (-1) para sair da votacao");
    	  voto=ler.nextInt();
    
    }
    System.out.println("----- RESULTADO FINAL -----");
    System.out.println("O Total = " + votostotal+ " = 100%"); // mostrar quantos votos teve no voto total = 100 
    // voto total é igual a 100% . sendo assim , candidato ==xx // (100*candidato)/votototal= x
	
    double porcvotospt =(100*votospt)/votostotal; //utilizar o double para dividir com numero decimal
    System.out.println("----- Partido PT: " +porcvotospt + "%");  //porcentagem
   
	double porcvotospdt =(100*votospdt)/votostotal;
    System.out.println("----- Partido PDT: " +porcvotospdt + "%");
    
    double porcvotospl =(100*votospl)/votostotal;
    System.out.println("----- Partido PL: " +porcvotospl + "%");
    
    double porcvotospsdb =(100*votospsdb)/votostotal;
    System.out.println("----- Partido PSDB: " +porcvotospsdb + "%");
    
    double porcvotosembranco =(100*votosembranco)/votostotal;
    System.out.println("----- Votos em branco:" +porcvotosembranco + "%");
    
    double porcvotosnulos =(100*votosnulos)/votostotal;
    System.out.println("----- Votos nulos:" +porcvotosnulos + "%");
    
    System.out.println("----- RESULTADO FINAL -----");
    
    ler.close();// fim do programa
	}
  }
}
