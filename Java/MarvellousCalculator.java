import java.awt.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener
{
    public Frame mainframe;
    public Button b1,b2,b3,b4;
    public TextField t1,t2;
    public Label lobj;
    Integer no1, no2;

    public Calculator(int Width, int Height, String Title)
    {
        mainframe = new Frame(Title);
        mainframe.setSize(Width,Height);
        mainframe.addWindowListener(this);

        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MULT");
        b4 = new Button("DIV");

        t1 = new TextField();
        t2 = new TextField();
        
        lobj = new Label();

        b1.setBounds(10,280,80,40);
        b2.setBounds(100,280,80,40);
        b3.setBounds(190,280,80,40);
        b4.setBounds(290,280,80,40);
        
        t1.setBounds(70,100,100,40);
        t2.setBounds(220,100,100,40);

        lobj.setBounds(150,170,200,100);

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);
        
        mainframe.add(t1);
        mainframe.add(t2);

        mainframe.add(lobj);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        mainframe.setLayout(null);
        mainframe.setVisible(true);
    }

    public void windowClosing(WindowEvent wobj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        try
        {
            no1 = Integer.parseInt(t1.getText());
            no2 = Integer.parseInt(t2.getText());

            if(aobj.getSource() == b1)
            {
                lobj.setText("Addition is : "+(no1+no2));
            }
            else if(aobj.getSource() == b2)
            {
                lobj.setText("Substraction is : "+(no1-no2));
            }
            else if(aobj.getSource() == b3)
            {
                lobj.setText("Multiplication is : "+(no1*no2));
            }
               else if(aobj.getSource() == b4)
            {
                lobj.setText("Division is : "+(no1/no2));
            }
        }
        catch(Exception eobj)
        {}
    }
}

class MarvellousCalculator
{
    public static void main(String A[])
    {
        Calculator cobj = new Calculator(400,400,"Marvellous Calculator");
    }
}