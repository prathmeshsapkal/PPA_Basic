import java.awt.*;
import java.awt.event.*;

class GUI2
{
    public static void main(String[]args)
    {
        Frame fobj = new Frame("Marvellous PPA");
        fobj.setSize(400,400);
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());

    }
}
class MarvellousListener implements WindowListener
{
    public void WindowDeactivated(WindowEvent obj)
    {}
    public void WindowActivated(WindowEvent obj)
    {}
    public void WindowDeiconified(WindowEvent obj)
    {}
    public void WindowIconified(WindowEvent obj)
    {}
    public void WindowClosed(WindowEvent obj)
    {}
    public void WindowClosing(WindowEvent obj)
    {System.exit}
    public void WindowOpened(WindowEvent obj)
    {}






}