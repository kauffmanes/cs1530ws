/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryDriver;
import java.util.Random;

/**
 *
 * @author sohel
 */
public class SingletonFactory extends AbstractFactory{
  //create an object of SingleObject
   private static SingletonFactory instance = new SingletonFactory();
   private static int factoryID;

   //make the constructor private so that this class cannot be
   //instantiated
   private SingletonFactory(){
          Random rand = new Random();
          factoryID = rand.nextInt(10000);       
   }

   //Get the only object available
   public static SingletonFactory getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.printf("Shape Factory ID: %d\n", factoryID);
   }    
   
   @Override
      public Color getColor(String colorType){
          return null;
      }   
   @Override
      public Shape getShape(String shapeType){
          return null;
      }   
 
}
