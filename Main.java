import java.util.Scanner;

public class Main {
		    public static void main(String[] args) throws Exception {//erico nunes
		        
		    	Scanner in = new Scanner(System.in);
		    	
		    	
		        FuncionarioComissionado f1 = new FuncionarioComissionado();
		        
		        System.out.println("Escolha um funcionario para as informações.");
		        	System.out.println("1- Funcionario comum\n2- Funcionario Comissionado");
		        	
		        int op = in.nextInt();	
		        switch(op) {
		        	
		        case 1:
		        	
		        	in.nextLine();
		        	
		        	System.out.print("\nDigite o primeiro nome do funcionario: ");
		        		f1.setPrimeiro_nome(in.nextLine());
		        			
		        			
		        	System.out.print("\nDigite o segundo nome do funcionario: ");
		        		f1.setSegundo_nome(in.nextLine());
		        	
		        	System.out.print("\nDigite o salario do funcionario: ");
		        		f1.setSalario(in.nextDouble());//Define um salario padrão de um funcionario	 
		        	
		        	System.out.println("\nNome do funcinario: "+f1.getPrimeiro_nome()+" "+ f1.getSegundo_nome());
		        	
		        	System.out.println("\nSalario do funcionario: "+f1.getSalario());
		        	
		        	break;
		        	
		        case 2:
		        	
		        	in.nextLine();
		        	
		        	System.out.print("\nDigite o primeiro nome do funcionario: ");
		        		f1.setPrimeiro_nome(in.nextLine());
		        	
		        	System.out.print("\nDigite o segundo nome do funcionario: ");
		        		f1.setSegundo_nome(in.nextLine());
		        	
		        	System.out.print("\nDigite o salario do funcionario: ");
		        		f1.setSalario(in.nextDouble());//Define um salario padrão de um funcionario	
		        		
		        	System.out.print("\nDigite a quantidade de vendas do funcionario: ");
		        		f1.setVendas(in.nextInt()); //quantidade de vendas feita pelo funcionario
		        		
		        //=========================================================================================//
		        		
		        	System.out.println("\nNome do funcinario: "+f1.getPrimeiro_nome()+" "+f1.getSegundo_nome());		        		
		        			        			        	
		        	f1.comissao();//salario comissionado		        	
		        	
		        	break;
		        	
		        default:
		        	
		        	System.out.println("Escolha um opção válida");
		        	
		        	break;
		        
		      }
           }
		}