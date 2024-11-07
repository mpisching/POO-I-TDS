/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainApp;
import domain.*;
/**
 *
 * @author Aluno
 */
public class MainApp {
  public static void main (String [] args ){
      Marca marca1 = new Marca();
      marca1.setId(19);
      marca1.setNome("ford");
      
      Marca marca2 = new Marca ();
      marca2.setId(2);
      marca2.setNome("Nissan");
      
      Modelo modelo1 = new Modelo();
      modelo1.setId(15);
      modelo1.setDescricao("Sedans");
      modelo1.setMarca(marca2);
      
      Modelo modelo2 = new Modelo();
      modelo2.setId(2);
      modelo2.setDescricao("Picapes");
      modelo2.setMarca(marca1);
      
      Veiculo veiculo1 = new Veiculo();
      veiculo1.setId(5);
      veiculo1.setPlaca("Vermelho médio");
      veiculo1.setModelo(modelo1);
      
      Veiculo veiculo2 = new Veiculo();
      veiculo2.setId(2);
      veiculo2.setPlaca("Cinza Grande");
      veiculo2.setModelo(modelo2);
      
      print(veiculo1);
      print(veiculo2);
      
  }
  
  public static void print(Veiculo veiculo) {
      System.out.println("Informações Carros\n\n");
      System.out.println("ID:\t" +veiculo.getId());
      System.out.println("Modelo:\t"+
              veiculo.getModelo().getDescricao());
      System.out.println("Marca:\t"+
              veiculo.getModelo().getMarca().getNome());
      System.out.println("Placa:\t" + veiculo.getPlaca());
            
  }
    
}
