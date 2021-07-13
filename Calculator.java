
public class Calculator {

    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorDesign().setVisible(true);
            }
        });
    }
    
}
