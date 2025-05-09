 import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
TextField tInput;
Panel panel;
String btnString[] = ("7","8","9". "+".

"4","5", "6","-" 
"1","2","3","*"
"C","0","=","/");
Button btn[] = new Button[16];
int num1=0, num2=0, result = 0;
char op;
public Calculator()
{
tInput=
new TextField(10);

panel new Panel(); add(tInput, "North"); add(panel, "Center");

panel.setLayout(new GridLayout(4,4));

for(int i=0; i < 16; i++)

btn[i]=new Button(btnString[i]):

btn[i].addActionl.istener(this);

panel.add(btn[i]):

1

addWindowf.istener(new WindowAdapter()

1

public void windowClosing(WindowEvent we)

System.exit(0);

39

Scanned with OKEN Scanner

173

1

public void actionPerformed(ActionEvent ae)

1

String str ae.getActionCommand();

if(str.equals("+"))

1

op =+

numl Integer.parseInt(tInput.getText());

tInput.setText("");

1

else if(str.equals("-"))
[2:52 pm, 09/05/2025] _.An_4nd.__: op=

numl = Integer.parseInt(Input.getText())

tInput.setText();

else if(str.equals("*"))

1

op=

numi Integer.parseInt(tInput.getText())

tInput.setText();

else if(str.equals("/"))

1

1

op=

muml = Integer.parseInt(ilnput.getText());

Input.setText("");

else if(str equals("="))

1

mum2= Integer.parseInt(Input.getText());

switch(op)

case; result = mimi + num2:

break:

case result sumi-num2;

1

break;

case result nominum2:

break:

case result minun

break

Input.setTextiresult

result = th

ebe iftstr.equabt "C

Input.setText

numinum resell = 0;

else

1

Input.setTextitlaput.getText()+ str);

1

public static void main(String args[])

Cakulator m= new Calculatort).

m.setTitle("My Calculator"

m.setSize(250,300

m.setVisible(true);