import javax.swing.JComponent;

public class Vector
{
  private JComponent[] Array;
  
  public Vector()
  {
    Array = new JComponent[0];
  }

  public void add(JComponent obj)
  {
    JComponent[] ezer = new JComponent[Array.length + 1];
    for (int i = 0; i < Array.length; i++) {
      ezer[i] = Array[i];
    }
    ezer[Array.length] = obj;
    Array = ((JComponent[])ezer.clone());
  }

  public JComponent read(int place)
  {
    if (place >= Array.length) return null;
    return Array[place];
  }

  public int size()
  {
    return Array.length;
  }
}