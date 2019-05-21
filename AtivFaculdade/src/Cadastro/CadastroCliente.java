package Cadastro;
import javax.swing.JOptionPane;
public class CadastroCliente {
	static final int QTREGISTROS = 2;
		
	public static String codigo[] = new String[QTREGISTROS];
	public static String nome[] = new String[QTREGISTROS];
	public static String email[] = new String[QTREGISTROS];
	public static String cidade[] = new String[QTREGISTROS];
	public static String uf[] = new String[QTREGISTROS];
			
public static void main(String args[]) {
		String opcao = "";
		
		do {
		try {	
			opcao = entradaDados("INFORME A OPÇÃO: "
			+ "\n 1 - Cadastrar"
			+ "\n 2 - Consultar"
			+ "\n 3 - Atualizar"
			+ "\n 4 - Excluir"
			+ "\n 5 - Listar"
			+ "\n 6 - Sair");
							
		switch (Byte.parseByte(opcao)) {
			case 1: cadastrar();
				break; 
			case 2: consultar();
				break;
			case 3: atualizar();
				break;
			case 4: excluir();
				break;
			case 5: listar();
				break;
			case 6: sair();
				break;
			default: menssagem("OPÇÃO INVÁLIDA!");
				break;
			}
		}
	catch(NumberFormatException ex) {
		menssagem("ENTRADA DE DADOS INVÁLIDA !");}
	catch(Exception ex) {
		menssagem("ERRO DE PROCESSAMENTO.");}
	
		}while(opcao != "6");
		
	}
		
	private static void cadastrar() {
		int clienteCad = 1;
		for(int i=0; i<QTREGISTROS; i++) {
			codigo[i] = String.valueOf(clienteCad++);
			nome[i]= entradaDados("Digite o Nome Completo:");
			email[i]= entradaDados("Digite o E-mail:");
			cidade[i]= entradaDados("Digite a Cidade:");
			uf[i]= entradaDados("Digite a UF:");
			}
	}
	private static void consultar() {
		int codigo = 0;
		codigo = Integer.parseInt(entradaDados("INFORME O CODIGO DO CADASTRO: "));
		menssagem("Nome: " + nome[codigo-1]+
				"\n E-mail: " + email[codigo-1]+
				"\n Cidade: " + cidade[codigo-1]+
				"\n UF: " + uf[codigo-1]);		
		}

	private static void atualizar() {
		int codigo = 0;
		codigo = Integer.parseInt(entradaDados("INFORME O CODIGO DO CADASTRO: "));
		menssagem("DADOS ATUAIS");
		menssagem("Nome: " + nome[codigo-1]+
				"\n E-mail: " + email[codigo-1]+
				"\n Cidade: " + cidade[codigo-1]+
				"\n UF: " + uf[codigo-1]);
		menssagem("DIGITE OS NOVOS DADOS");
		String nomeAtual = entradaDados("Digite o Nome Completo:");
		String emailAtual = entradaDados("Digite o E-mail:");
		String cidadeAtual = entradaDados("Digite a Cidade:");
		String ufAtual = entradaDados("Digite a UF:");
		int resposta = JOptionPane.showConfirmDialog(null, "DESEJA REALMENTE ATUALIZAR?", "Atualizar", JOptionPane.YES_NO_OPTION);
		if (resposta == JOptionPane.YES_OPTION) {
			nome[codigo-1] = nomeAtual;
			email[codigo-1] = emailAtual;
			cidade[codigo-1] = cidadeAtual;
			uf[codigo-1] = ufAtual;
			menssagem("ATUALIZADO !");
			menssagem("Nome: " + nome[codigo-1]+
					"\n E-mail: " + email[codigo-1]+
					"\n Cidade: " + cidade[codigo-1]+
					"\n UF: " + uf[codigo-1]);
			} else if (resposta == JOptionPane.NO_OPTION) {
				menssagem("NÃO FOI ATUALIZADO!");
				menu();
			}
		}
	
	private static void excluir() {
		int codigo = 0;
		codigo = Integer.parseInt(JOptionPane.showInputDialog("INFORME O CODIGO DO CADASTRO: "));
		menssagem("Nome: " + nome[codigo-1]+
				"\n E-mail: " + email[codigo-1]+
				"\n Cidade: " + cidade[codigo-1]+
				"\n UF: " + uf[codigo-1]);
		int resposta = JOptionPane.showConfirmDialog(null, "DESEJA REALMENTE EXCLUIR?", "Excluir", JOptionPane.YES_NO_OPTION);
		if (resposta == JOptionPane.YES_OPTION) {
			nome[codigo-1] = null;
			email[codigo-1] = null;
			cidade[codigo-1] = null;
			uf[codigo-1] = null;
			menssagem("EXCLUIDO !");
			} else if (resposta == JOptionPane.NO_OPTION) {
				menssagem("NÃO FOI EXCLUIDO!");
				menu();
			}
		}

	private static void listar(){
		int resposta = JOptionPane.showConfirmDialog(null, "DESEJA LISTAR ALGUM CADASTRO ESPECIFICO?", "Consulta", JOptionPane.YES_NO_OPTION);
		if (resposta == JOptionPane.YES_OPTION) {
			consultar();
			} else if (resposta == JOptionPane.NO_OPTION) {
				menssagem("LISTANDO TODOS OS CADASTROS!");
				for(int i=0; i<QTREGISTROS; i++) {
					menssagem("\n Nome: " + nome[i] +
							"\n E-mail: " + email[i] +
							"\n Cidade: " + cidade[i] +
							"\n UF: " + uf[i]);
			}
		}
	}
	private static void menu(){
	String opcao = "";
		
		do {
		try {	
			opcao = entradaDados("INFORME SUA OPÇÃO: "
			+ "\n 1 - Cadastrar"
			+ "\n 2 - Consultar"
			+ "\n 3 - Atualizar"
			+ "\n 4 - Excluir"
			+ "\n 5 - Listar"
			+ "\n 6 - Sair");
						
		switch (Byte.parseByte(opcao)) {
			case 1: cadastrar();
				break; 
			case 2: consultar();
				break;
			case 3: atualizar();
				break;
			case 4: excluir();
				break;
			case 5: listar();
				break;
			case 6: sair();
				break;
			default: menssagem("OPÇÃO INVÁLIDA!");
				break;
			}
		}
	catch(NumberFormatException ex) {
		menssagem("ENTRADA DE DADOS INVÁLIDA !");}
	catch(Exception ex) {
		menssagem("ERRO DE PROCESSAMENTO.");}
	
		}while(opcao != "6");
		
	}
	private static void sair() {
		int resposta = JOptionPane.showConfirmDialog(null, "DESEJA REALMENTE SAIR?", "SAIR", JOptionPane.YES_NO_OPTION);
		if (resposta == JOptionPane.YES_OPTION) {
			menssagem("ATE LOGO !");
			System.exit(0);
			} else if (resposta == JOptionPane.NO_OPTION) {
				menu();
			}
		}
	public static String entradaDados(String texto){
		return JOptionPane.showInputDialog(null, texto);
	}
	public static void menssagem(String texto) {
		JOptionPane.showMessageDialog(null, texto);
		}
	}
