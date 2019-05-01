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
			opcao = JOptionPane.showInputDialog("Informe a sua opção: "
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
			default: menssagem("Opcao inválida!");
				break;
			}
		}
	catch(NumberFormatException ex) {
		menssagem("Entrada de dados invalida !");}
	catch(Exception ex) {
		menssagem("Erro de Processamento.");}
	
		}while(opcao != "6");
		
	}
		
	private static void cadastrar() {
		int clienteCad = 1;
		for(int i=0; i<QTREGISTROS; i++) {
			codigo[i] = String.valueOf(clienteCad++);
			nome[i]= JOptionPane.showInputDialog("Digite o Nome Completo:");
			email[i]= JOptionPane.showInputDialog("Digite o E-mail:");
			cidade[i]= JOptionPane.showInputDialog("Digite a Cidade:");
			uf[i]= JOptionPane.showInputDialog("Digite a UF:");
			}
	}
	private static void consultar() {
		int codigo = 0;
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo: "));
		menssagem("Nome: " + nome[codigo-1]+
				"\n E-mail: " + email[codigo-1]+
				"\n Cidade: " + cidade[codigo-1]+
				"\n UF: " + uf[codigo-1]);		
		}

	private static void atualizar() {
		int codigo = 0;
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo: "));
		nome[codigo-1] = JOptionPane.showInputDialog("Digite o Nome Completo:");
		email[codigo-1] = JOptionPane.showInputDialog("Digite o E-mail:");
		cidade[codigo-1] = JOptionPane.showInputDialog("Digite a Cidade:");
		uf[codigo-1] 
				= JOptionPane.showInputDialog("Digite a UF:");
		menssagem("ATUALIZADO !");
		}

	private static void excluir() {
		int codigo = 0;
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo: "));
			nome[codigo-1] = null;
			email[codigo-1] = null;
			cidade[codigo-1] = null;
			uf[codigo-1] = null;
		}

	private static void listar() {
		for(int i=0; i<QTREGISTROS; i++) {
			menssagem("\n Nome: " + nome[i] +
					"\n E-mail: " + email[i] +
					"\n Cidade: " + cidade[i] +
					"\n UF: " + uf[i]);
		}
	}

	private static void sair() {
		System.exit(0);
		}

	public static void menssagem(String texto) {
		JOptionPane.showMessageDialog(null, texto);
		}
	}