import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.FloatControl;
import javax.swing.*;


public class CalculatorApllication implements ActionListener {

        double num1=0,num2=0,result=0;
        int calculation=0;



        JFrame frame = new JFrame("Calculator");
        JLabel label = new JLabel(null, null, 0);
        JTextField textField = new JTextField(null, null, 0);
        
        JRadioButton on = new JRadioButton("on", null, false);
        JRadioButton off = new JRadioButton("off", null, false);

        JButton zero = new JButton("0", null);
        JButton one = new JButton("1", null);
        JButton two = new JButton("2", null);
        JButton three = new JButton("3", null);
        JButton four = new JButton("4", null);
        JButton five = new JButton("5", null);
        JButton six = new JButton("6", null);
        JButton seven = new JButton("7", null);
        JButton eight = new JButton("8", null);
        JButton nine = new JButton("9", null);

        JButton plus = new JButton("+", null);
        JButton minus = new JButton("-", null);
        JButton mul = new JButton("x", null);
        JButton div = new JButton("/", null);
        JButton equal = new JButton("=", null);
        JButton dot = new JButton(".", null);
        JButton clear = new JButton("C", null);
        JButton delete = new JButton("DEL", null);

        JButton square = new JButton("x\u00B2", null);
        JButton reciprocal = new JButton("1/x", null);
        JButton sqrt = new JButton("\u221A", null);


        

        CalculatorApllication(){
            preparegui();
            addComponents();
            addActionEvent();
        }


        public void preparegui(){

            frame.setSize(305, 510);
            frame.getContentPane().setLayout(null);
            frame.getContentPane().setBackground(Color.BLACK);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        }


        public void addComponents(){
            label.setBounds(250, 0, 50, 50);
            label.setForeground(Color.white);
            frame.add(label);

            textField.setBounds(10, 40, 270, 40);
            textField.setFont(new Font("Arial",Font.BOLD, 20));
            textField.setEnabled(false);
            textField.setHorizontalAlignment(SwingConstants.RIGHT);
            frame.add(textField);


            on.setBounds(10, 95, 60, 40);
            on.setSelected(false);
            on.setFont(new Font("Arial", Font.BOLD,14));
            on.setBackground(Color.black);
            on.setForeground(Color.WHITE);
            on.setFocusable(false);
            frame.add(on);

            off.setBounds(10, 120, 60, 40);
            off.setSelected(false);
            off.setFont(new Font("Arial", Font.BOLD,14));
            off.setBackground(Color.black);
            off.setForeground(Color.white);
            off.setFocusable(false);
            frame.add(off);


            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(on);
            buttonGroup.add(off);

            seven.setBounds(10, 230, 60, 40);
            seven.setFont(new Font("Arial",Font.BOLD, 20));
            seven.setFocusable(false);
            frame.add(seven);

            eight.setBounds(80, 230, 60, 40);
            eight.setFont(new Font("Arial",Font.BOLD, 20));
            eight.setFocusable(false);
            frame.add(eight);

            nine.setBounds(150, 230, 60, 40);
            nine.setFont(new Font("Arial",Font.BOLD, 20));
            nine.setFocusable(false);
            frame.add(nine);

            four.setBounds(10, 290, 60, 40);
            four.setFont(new Font("Arial",Font.BOLD, 20));
            four.setFocusable(false);
            frame.add(four);

            five.setBounds(80, 290, 60, 40);
            five.setFont(new Font("Arial",Font.BOLD, 20));
            five.setFocusable(false);
            frame.add(five);

            six.setBounds(150, 290, 60, 40);
            six.setFont(new Font("Arial",Font.BOLD, 20));
            six.setFocusable(false);
            frame.add(six);

            one.setBounds(10, 350, 60, 40);
            one.setFont(new Font("Arial",Font.BOLD, 20));
            one.setFocusable(false);
            frame.add(one);

            two.setBounds(80, 350, 60, 40);
            two.setFont(new Font("Arial",Font.BOLD, 20));
            two.setFocusable(false);
            frame.add(two);

            three.setBounds(150, 350, 60, 40);
            three.setFont(new Font("Arial",Font.BOLD, 20));
            three.setFocusable(false);
            frame.add(three);

            dot.setBounds(150, 410, 60, 40);
            dot.setFont(new Font("Arial",Font.BOLD, 20));
            dot.setFocusable(false);
            frame.add(dot);

            zero.setBounds(10, 410, 130, 40);
            zero.setFont(new Font("Arial",Font.BOLD, 20));
            zero.setFocusable(false);
            frame.add(zero);

            equal.setBounds(220, 350, 60, 100);
            equal.setFont(new Font("Arial",Font.BOLD, 20));
            equal.setBackground(new Color(239, 188, 2));
            equal.setFocusable(false);
            frame.add(equal);

            div.setBounds(220, 110, 60, 40);
            div.setFont(new Font("Arial",Font.BOLD, 20));
            div.setBackground(new Color(239, 188, 2));
            div.setFocusable(false);
            frame.add(div);

            minus.setBounds(220, 170, 60, 40);
            minus.setFont(new Font("Arial",Font.BOLD, 20));
            minus.setBackground(new Color(239, 188, 2));
            frame.add(minus);

            sqrt.setBounds(10, 170, 60, 40);
            sqrt.setFont(new Font("Arial",Font.BOLD, 20));
            sqrt.setFocusable(false);
            frame.add(sqrt);

            mul.setBounds(220, 230, 60, 40);
            mul.setFont(new Font("Arial",Font.BOLD, 20));
            mul.setFocusable(false); 
            mul.setBackground(new Color(239, 188, 2));
            frame.add(mul);

            plus.setBounds(220, 290, 60, 40);
            plus.setFont(new Font("Arial",Font.BOLD, 20));
            plus.setFocusable(false);
            plus.setBackground(new Color(239, 188, 2));
            frame.add(plus);

            square.setBounds(80, 170, 60, 40);
            square.setFont(new Font("Arial",Font.BOLD, 20));
            square.setFocusable(false);
            frame.add(square);

            reciprocal.setBounds(150, 170, 60, 40);
            reciprocal.setFont(new Font("Arial",Font.BOLD, 15));
            reciprocal.setFocusable(false);
            frame.add(reciprocal);

            delete.setBounds(150, 110, 60, 40);
            delete.setFont(new Font("Arial",Font.BOLD, 12));
            delete.setBackground(Color.RED);
            delete.setForeground(Color.WHITE);
            frame.add(delete);

            clear.setBounds(80, 110, 60, 40);
            clear.setFont(new Font("Arial",Font.BOLD, 12));
            clear.setBackground(Color.RED);
            clear.setForeground(Color.WHITE);
            frame.add(clear);




            

        }

         public void  addActionEvent(){
            on.addActionListener(this);
            off.addActionListener(this);
            seven.addActionListener(this);
            eight.addActionListener(this);
            nine.addActionListener(this);
            four.addActionListener(this);
            five.addActionListener(this);
            six.addActionListener(this);
            one.addActionListener(this);
            two.addActionListener(this);
            three.addActionListener(this);
            dot.addActionListener(this);
            zero.addActionListener(this);
            equal.addActionListener(this);
            div.addActionListener(this);
            minus.addActionListener(this);
            sqrt.addActionListener(this);
            mul.addActionListener(this);
            plus.addActionListener(this);
            reciprocal.addActionListener(this);
            square.addActionListener(this);
            delete.addActionListener(this);
            clear.addActionListener(this);


         }

    public static void main(String[] args) {

        CalculatorApllication calculator = new CalculatorApllication();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object Object = e.getSource();


        if(Object==on){
            enable();
        }else if(Object==off){
            disable();
        }else if(Object==clear){
            label.setText("");
            textField.setText("");
        }else if(Object==delete){
            int length = textField.getText().length();
            int number = length - 1;

            if(length>0){
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if(textField.getText().endsWith("")){
                label.setText("");
            }
        }else if(Object==zero){
            if(textField.getText().equals("0")){
                return;
            }else{
                textField.setText(textField.getText() + "0");
            }
        }else if(Object==one){
            if(textField.getText().equals("1")){
                return;
            }else{
                textField.setText(textField.getText() + "1");
            }
        }else if(Object==two){
            if(textField.getText().equals("2")){
                return;
            }else{
                textField.setText(textField.getText() + "2");
            }
        }else if(Object==three){
            if(textField.getText().equals("3")){
                return;
            }else{
                textField.setText(textField.getText() + "3");
            }
        }else if(Object==four){
            if(textField.getText().equals("4")){
                return;
            }else{
                textField.setText(textField.getText() + "4");
            }
        }else if(Object==five){
            if(textField.getText().equals("5")){
                return;
            }else{
                textField.setText(textField.getText() + "5");
            }
        }else if(Object==six){
            if(textField.getText().equals("6")){
                return;
            }else{
                textField.setText(textField.getText() + "6");
            }
        }else if(Object==seven){
            if(textField.getText().equals("7")){
                return;
            }else{
                textField.setText(textField.getText() + "7");
            }
        }else if(Object==eight){
            if(textField.getText().equals("8")){
                return;
            }else{
                textField.setText(textField.getText() + "8");
            }
        }else if(Object==nine){
            if(textField.getText().equals("9")){
                return;
            }else{
                textField.setText(textField.getText() + "9");
            }
        }else if(Object==dot){
            if(textField.getText().equals(".")){
                return;
            }else{
                textField.setText(textField.getText() + ".");
            }
        }else if(Object==plus){
            String str =textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
        }else if(Object==minus){
            String str =textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
        }else if(Object==mul){
            String str =textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "X");
        }
        else if(Object==div){
            String str =textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
        }else if(Object==square){
            num1 = Double.parseDouble(textField.getText());
            Double square = Math.pow(num1,2);
            Double.toString(square);
            String string = Double.toString(square);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0", ""));
            }else{
                textField.setText(string);
            }
        }else if(Object==sqrt){
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));

        }else if(Object==reciprocal){
            num1 = Double.parseDouble(textField.getText());
            double reciprocal = 1/num1;
            String string = Double.toString(reciprocal);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0", ""));
            }else{
                textField.setText(string);
            }

        }else if(Object==equal){
            num2 = Double.parseDouble(textField.getText());
            switch(calculation){
                case 1:
                        result = num1 + num2 ;
                        break;
                case 2:
                        result = num1 - num2;
                        break;
                case 3: 
                        result = num1 * num2;
                        break;
                case 4:
                        result = num1 / num2;
                        break;

            }
            
            if(Double.toString(result).endsWith(".0")){
                    textField.setText(Double.toString(result).replace(".0", ""));
                }else{
                    textField.setText(Double.toString(result));
                }
                label.setText("");
                num1=result;
            
        }

    }

    public void enable(){
        on.setEnabled(false);
        off.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        dot.setEnabled(true);
        zero.setEnabled(true);
        equal.setEnabled(true);
        div.setEnabled(true);
        minus.setEnabled(true);
        sqrt.setEnabled(true);
        mul.setEnabled(true);
        plus.setEnabled(true);
        reciprocal.setEnabled(true);
        square.setEnabled(true);
        delete.setEnabled(true);
        clear.setEnabled(true);
    }
     public void disable(){
        on.setEnabled(true);
        off.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        dot.setEnabled(false);
        zero.setEnabled(false);
        equal.setEnabled(false);
        div.setEnabled(false);
        minus.setEnabled(false);
        sqrt.setEnabled(false);
        mul.setEnabled(false);
        plus.setEnabled(false);
        reciprocal.setEnabled(false);
        square.setEnabled(false);
        delete.setEnabled(false);
        clear.setEnabled(false);
    }
}
