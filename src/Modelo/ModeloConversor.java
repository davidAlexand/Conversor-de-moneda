/**@author David Alexander Romero**/
package Modelo;

public class ModeloConversor {      
      public double aPesetas(double euros)
      {
      Double pesetas = (euros*166.3866);
      return pesetas;  
      }
      
      public double aEuros(double pesetas)
      {
      Double euros = (pesetas*0.00601);
      return euros;
      }
}
    

