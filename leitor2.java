package validacao_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class leitor2 {
	public static void main(String[] args)  {
				String path = "C:\\Users\\Windows10Pro\\Desktop\\teste1\\teste1.txt";

				List<estrutura> list = new ArrayList<estrutura>();

					try(BufferedReader br = new BufferedReader(new FileReader(path))){
						
						String line = br.readLine();
						line = br.readLine();
						while(line != null){

						if (path != null != path.isEmpty()) { 
						String[] vetor = line.split(";");
							    Double NUMERO_DA_VENDA = Double.parseDouble( vetor[0]);
							    String NOME_DO_CLIENTE = vetor[1];
							    String  DATA_DA_VENDA = vetor[2];
							    Double VALOR_DA_VENDA = Double.parseDouble(vetor[3]);

							        estrutura est = new estrutura(NUMERO_DA_VENDA, NOME_DO_CLIENTE, DATA_DA_VENDA, VALOR_DA_VENDA);
								         list.add(est);
										    line = br.readLine();
						}
										}
						System.out.println("estrutura");
						for(estrutura e : list){
								System.out.println(e);
						}
					}
					catch(IOException e){
						System.out.println("erro:" + e.getMessage());
					}catch(Exception nf){
						System.out.println("inavlido:" + nf.getMessage());
						nf.printStackTrace();
					}
		}
	}


