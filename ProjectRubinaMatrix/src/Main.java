import javax.swing.*;


public class Main {


    @SuppressWarnings("deprecation")
	
	public static void main(String[] args) {
        
        String prim11= JOptionPane.showInputDialog("Sheno numrin e rreshtave te determinantes");
        String prim12= JOptionPane.showInputDialog("Sheno numrin e kolonave te determinantes");
        
        int rresht11 = new Integer(prim11).intValue();
        int kolon11 = new Integer(prim12).intValue();
        //3x3 me 3x3
        
        
        
        if(rresht11==3 & kolon11==3) {
        	String num1= JOptionPane.showInputDialog("Sheno vleren e a11:");
            String num2= JOptionPane.showInputDialog("Sheno vleren e a12:");
            String num3= JOptionPane.showInputDialog("Sheno vleren e a13:");
            String num4= JOptionPane.showInputDialog("Sheno vleren e a21:");
            String num5= JOptionPane.showInputDialog("Sheno vleren e a22:");
            String num6= JOptionPane.showInputDialog("Sheno vleren e a23:");
            String num7= JOptionPane.showInputDialog("Sheno vleren e a31:");
            String num8= JOptionPane.showInputDialog("Sheno vleren e a32:");
            String num9= JOptionPane.showInputDialog("Sheno vleren e a33:");
            int a11 = new Integer(num1).intValue();
            int a12 = new Integer(num2).intValue();
            int a13 = new Integer(num3).intValue();
            int a21 = new Integer(num4).intValue();
            int a22 = new Integer(num5).intValue();
            int a23 = new Integer(num6).intValue();
            int a31 = new Integer(num7).intValue();
            int a32 = new Integer(num8).intValue();
            int a33 = new Integer(num9).intValue();
        int a[][] = {
                {a11, a12, a13},
                {a21, a22, a23},
                {a31, a32, a33}
                
        };
        System.out.println(a11*a22*a33 + a12*a23*a31 + a13*a21*a32 - (a31*a22 * a13+a32*a23*a11+a33*a21*a12) + " eshte vlera e determinantes se kerkuar");
        

      

       
        
    }
        if(rresht11==2 & kolon11==2) {
        	String num1= JOptionPane.showInputDialog("Sheno vleren e a11:");
            String num2= JOptionPane.showInputDialog("Sheno vleren e a12:");
            String num4= JOptionPane.showInputDialog("Sheno vleren e a21:");
            String num5= JOptionPane.showInputDialog("Sheno vleren e a22:");}
        
    }
}
        
            
        
    
