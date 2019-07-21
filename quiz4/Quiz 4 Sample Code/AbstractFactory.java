/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryDriver;

/**
 *
 * @author sohel
 */
public abstract class AbstractFactory {
  //  private static long VIN; 
    public abstract Shape getShape(String colorType);
    public abstract Color getColor(String shapeType); 
    public void showMessage(){};
}
