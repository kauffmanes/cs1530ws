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
public class AbstractFactoryTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int loop = 1;loop < 3;loop++){
            // TODO code application logic here
            System.out.println("New set:");
            AbstractFactory factory1 = FactoryProducer.getFactory("SHAPE");
            factory1.showMessage();
            Shape shape1 = factory1.getShape("CIRCLE");
            //call draw method of Circle
            shape1.draw();

            AbstractFactory factory2 = FactoryProducer.getFactory("SHAPE");
            factory2.showMessage();
            Shape shape2 = factory2.getShape("RECTANGLE");
            //call draw method of Circle
            shape2.draw();

            AbstractFactory factory3 = FactoryProducer.getFactory("COLOR");
            factory3.showMessage();
            Color color1 = factory3.getColor("RED");
            //call FILL method of Red
            color1.fill();

            AbstractFactory factory4 = FactoryProducer.getFactory("COLOR");
            factory4.showMessage();
            Color color2 = factory4.getColor("GREEN");
            //call FILL method of Green
            color2.fill();

            AbstractFactory factory5 = FactoryProducer.getFactory("COLOR");
            factory5.showMessage();
            Color color3 = factory5.getColor("BLUE");
            //call FILL method of Blue
            color3.fill();
        }
    }
}
