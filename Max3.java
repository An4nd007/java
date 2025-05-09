import java.awt.*;
import java.awt.event.*;

public class Max3 extends Frame implements ActionListener {
    TextField t1, t2, t3, tResult;
    Label l1, l2, l3, lMax;
    Button bfindMax;

    public Max3() {
        setLayout(new FlowLayout());

        l1 = new Label("Number 1");
        t1 = new TextField(10);
        l2 = new Label("Number 2");
        t2 = new TextField(10);
        l3 = new Label("Number 3");
        t3 = new TextField(10);
        lMax = new Label("Maximum");
        tResult = new TextField(10);
        tResult.setEditable(false);
        bfindMax = new Button("Find Max");

        add(l1); 
        add(t1);
        add(l2); 
        add(t2);
        add(l3); 
        add(t3);
        add(bfindMax);
        add(lMax); 
        add(tResult);
       

        bfindMax.addActionListener(this);

        setTitle("Max of 3 Numbers");
        setSize(250, 200);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent ae) {
        int n1,n2,n3,Max;
     
         n1 = Integer.parseInt(t1.getText());
         n2 = Integer.parseInt(t2.getText());
         n3 = Integer.parseInt(t3.getText());

             Max = Math.max(n1, Math.max(n2, n3));
            tResult.setText(String.valueOf(Max));
        } 
    public static void main(String[] args) {
        new Max3();
    }
}


