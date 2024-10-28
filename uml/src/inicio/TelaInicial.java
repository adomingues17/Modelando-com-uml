package inicio;

import java.util.Scanner;

import aparelho.AparelhoTelefonico;
import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;

public class TelaInicial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
		NavegadorInternet navegadorInternet = new NavegadorInternet();
		ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
	
		System.out.println("Selecione a operação desejada!");
		String entrada = scan.nextLine();	
		
		if((entrada.equals("l"))) {
			System.out.println("O que deseja fazer?");
			String selecao = scan.nextLine();	
			
			if(selecao.equals("el")) {
				System.out.println("Digite o número desejado.");
				String numero = scan.nextLine();
				aparelhoTelefonico.ligar(numero);
				String chamada = scan.nextLine();				
				aparelhoTelefonico.efetuarChamada(chamada);							
			}
			
			else if(selecao.equals("ac")) {
				aparelhoTelefonico.atender();				
				aparelhoTelefonico.efetuarChamada(selecao = "at");	
			}
			
			else if(selecao.equals("icv")) {
				String encerrarChamada = null;
				do {
					aparelhoTelefonico.iniciarCorreioVoz();
					encerrarChamada = scan.nextLine();
				}while(!encerrarChamada.equals("ec"));			
			}
			System.out.println("Encerrando chamada.");	
		}	
		
		else if(entrada.equals("m")) {
			System.out.println("O que deseja fazer.");
			String selecao = scan.nextLine();
			if(selecao.equals("tm")) {
				reprodutorMusical.tocar();				
			}
			else if(selecao.equals("pm")) {
				reprodutorMusical.pausar();
			}
			else if(selecao.equals("sm")) {
				reprodutorMusical.selecionarMusica();
			}
			System.out.println("Saindo do player.");
		}
		
		else if(entrada.equals("an")) {
			String fechar = null;
			do {
			System.out.println("Digite a url!");			
			String url = scan.nextLine();
			navegadorInternet.exibirPagina(url);
			
			String selecao = scan.nextLine();
			if(selecao.equals("ana")) {
				System.out.println("Abrindo nova aba.");
				navegadorInternet.adicionarNovaAba();
				System.out.println("Digite a url!");			
				String url2 = scan.nextLine();
				navegadorInternet.exibirPagina(url2);
				
			}
			else if(selecao.equals("ap")) {				
				navegadorInternet.atualizarPagina();
			}
			fechar = scan.nextLine();
			}while(!fechar.equals("x"));
			System.out.println("Fechando navegador.");
		}	
		
		System.out.println("Fim.");		
		scan.close();
	}
}