package aparelho;

import java.util.Scanner;

public class AparelhoTelefonico {
	Scanner scan = new Scanner(System.in);
	
	public void ligar(String numero) {
		System.out.println("Ligando para "+ numero);		
	}
	
	public void efetuarChamada(String chamada) {
		if(chamada.equals("at")) {	
			String finalizarChamada = null;
			do {
				System.out.println("Em chamada.");					
				finalizarChamada = scan.nextLine();
			}while(!finalizarChamada.equals("ec"));
			}
		else {
			System.out.println("Não atendeu.");
		}
		scan.close();
	}
	
	public void atender() {
		System.out.println("Em chamada!");		
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Inicianado correio de voz!");		
	}	
}