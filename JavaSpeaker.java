import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class JavaSpeaker extends Frame implements ActionListener, WindowListener {
    TextField text;
    Button validate;
    public JavaSpeaker(){
        //Textfield
        //Button
        setLayout(new FlowLayout());
        text = new TextField("Votre texte");
        add(text);

        validate = new Button("Valider");
        add(validate);

        validate.addActionListener(this);

        addWindowListener(this);

        setTitle("J'parle Québécois, lo !");
        setSize(500, 400);
        setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent evt){
        System.exit(0);
    }

    public static void main(String[] args){

        System.out.println("Hello :) ");
        JavaSpeaker app = new JavaSpeaker();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(text.getText());
    }

    // Not Used, BUT need to provide an empty body to compile.
    @Override public void windowOpened(WindowEvent evt) { }
    @Override public void windowClosed(WindowEvent evt) { }

    // For Debugging
@Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
@Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
@Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
@Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
}
