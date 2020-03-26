/*import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;*/

public class GUI extends javax.swing.JFrame implements java.awt.event.ActionListener, java.awt.event.ItemListener
{
  private JPanel buttonsPanel;
  private JPanel codePanel;
  private JPanel packPanel;
  private JPanel packBottom;
  private JPanel impPanel;
  private JPanel impBottom;
  private JPanel creditsPanel;
  private JButton btn;
  private JButton crtcd;
  private JButton lbl;
  private JButton tb;
  private JButton txt;
  private JButton chkbox;
  private JButton addPack;
  private JButton removePack;
  private JButton addImp;
  private JButton removeImp;
  private javax.swing.JTextArea jta;
  private DefaultListModel<String> listModelPack;
  private DefaultListModel<String> listModelImp;
  private javax.swing.JList<String> listPack;
  private javax.swing.JList<String> listImp;
  private javax.swing.JScrollPane scrollerPack;
  private javax.swing.JScrollPane scrollerImp;
  private javax.swing.JScrollPane codeScroller;
  private javax.swing.JTextField pack;
  private javax.swing.JTextField imp;
  private String code1;
  private String code2;
  private String code3;
  private String code4;
  private String title;
  private String code;
  private String sep;
  private String tab;
  private int cbtn;
  private int clbl;
  private int ctxt;
  private int ctb;
  private int cchk;
  private java.awt.Color c;
  private java.awt.Color b;
  private java.awt.Font f;
  private javax.swing.JTabbedPane tabbedPane;
  private javax.swing.JLabel Programmer;
  private javax.swing.JLabel IconDesigner;
  private javax.swing.JLabel LogoDesigner;
  private javax.swing.JLabel Eitiel;
  private javax.swing.JLabel Eitan;
  private Vector arr;
  private javax.swing.JCheckBox theme;
  private java.awt.Dimension sizeBox;
  
  public GUI()
  {
    arr = new Vector();
    sep = System.lineSeparator();
    tab = "    ";
    








    c = new java.awt.Color(15794175);
    b = new java.awt.Color(6591981);
    f = new java.awt.Font("Arial", 0, 12);
    getContentPane().setBackground(b);
    getContentPane().setFont(f);
    tabbedPane = new javax.swing.JTabbedPane();
    tabbedPane.setFont(f);
    sizeBox = new java.awt.Dimension(350, 150);
    tabbedPane.setPreferredSize(sizeBox);
    
    buttonsPanel = new JPanel();
    btn = new JButton("צור כפתור");
    lbl = new JButton("צור תוית טקסט");
    tb = new JButton("צור אזור טקסט");
    txt = new JButton("צור שדה טקסט");
    crtcd = new JButton("שמור קובץ");
    theme = new javax.swing.JCheckBox("מצב Windows");
    chkbox = new JButton("צור תיבת סימון");
    code1 = "";
    code2 = "";
    code3 = "";
    code4 = "";
    cbtn = 0;
    clbl = 0;
    ctxt = 0;
    ctb = 0;
    cchk = 0;
    
    btn.setFont(f);
    lbl.setFont(f);
    tb.setFont(f);
    txt.setFont(f);
    crtcd.setFont(f);
    theme.setFont(f);
    theme.setSelected(false);
    chkbox.setFont(f);
    
    btn.addActionListener(this);
    lbl.addActionListener(this);
    tb.addActionListener(this);
    txt.addActionListener(this);
    chkbox.addActionListener(this);
    crtcd.addActionListener(this);
    theme.addItemListener(this);
    
    buttonsPanel.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
    buttonsPanel.setBackground(c);
    buttonsPanel.setLayout(new java.awt.GridLayout(4, 3));
    buttonsPanel.add(btn);
    buttonsPanel.add(lbl);
    buttonsPanel.add(tb);
    buttonsPanel.add(txt);
    buttonsPanel.add(chkbox);
    buttonsPanel.add(crtcd);
    buttonsPanel.add(theme);
    
    tabbedPane.addTab("פאנל הכפתורים", buttonsPanel);
    tabbedPane.setMnemonicAt(0, 49);
    
    packPanel = new JPanel();
    listModelPack = new DefaultListModel();
    listPack = new javax.swing.JList(listModelPack);
    scrollerPack = new javax.swing.JScrollPane(listPack);
    packBottom = new JPanel();
    addPack = new JButton("הוסף חבילה");
    removePack = new JButton("הסר חבילה");
    pack = new javax.swing.JTextField(14);
    
    listModelPack.addElement("javax.swing.*");
    listModelPack.addElement("java.awt.FlowLayout");
    listPack.setSelectionMode(0);
    listPack.setLayoutOrientation(0);
    listPack.setSelectedIndex(0);
    listPack.setVisibleRowCount(-1);
    scrollerPack.setPreferredSize(sizeBox);
    
    addPack.setFont(f);
    removePack.setFont(f);
    
    addPack.addActionListener(this);
    removePack.addActionListener(this);
    
    packPanel.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
    packPanel.setBackground(c);
    packBottom.setBackground(c);
    packPanel.setLayout(new java.awt.BorderLayout());
    packPanel.add(scrollerPack, "Center");
    packBottom.add(removePack);
    packBottom.add(pack);
    packBottom.add(addPack);
    packPanel.add(packBottom, "South");
    
    tabbedPane.addTab("פאנל החבילות", packPanel);
    tabbedPane.setMnemonicAt(1, 50);
    
    impPanel = new JPanel();
    addImp = new JButton("הוסף מימוש");
    removeImp = new JButton("הסר מימוש");
    imp = new javax.swing.JTextField(14);
    listModelImp = new DefaultListModel();
    listImp = new javax.swing.JList(listModelImp);
    scrollerImp = new javax.swing.JScrollPane(listImp);
    impBottom = new JPanel();
    
    listModelImp.addElement("ActionListener");
    listImp.setSelectionMode(0);
    listImp.setLayoutOrientation(0);
    listImp.setSelectedIndex(0);
    listImp.setVisibleRowCount(-1);
    scrollerImp.setPreferredSize(sizeBox);
    
    addImp.setFont(f);
    removeImp.setFont(f);
    
    addImp.addActionListener(this);
    removeImp.addActionListener(this);
    
    impPanel.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
    impPanel.setBackground(c);
    impBottom.setBackground(c);
    impPanel.setLayout(new java.awt.BorderLayout());
    impBottom.add(removeImp);
    impBottom.add(imp);
    impBottom.add(addImp);
    impPanel.add(scrollerImp, "Center");
    impPanel.add(impBottom, "South");
    
    tabbedPane.addTab("פאנל המימושים", impPanel);
    tabbedPane.setMnemonicAt(2, 51);
    
    codePanel = new JPanel();
    jta = new javax.swing.JTextArea(30, 40);
    codeScroller = new javax.swing.JScrollPane(jta);
    
    codePanel.setBackground(b);
    codePanel.add(codeScroller);
    jta.setFont(new java.awt.Font("Arial", 0, 12));
    
    code = (code1 + tab + "public GUI() {" + sep + code2 + code3 + code4);
    jta.setText(createCode());
    
    creditsPanel = new JPanel();
    Programmer = new javax.swing.JLabel("<html><div align = right>כל הזכויות על:<br />עיצוב, פיתוח, תכנות ופרסום התוכנה שמורות ל:<br />עמינדב נחשון.</div>");
    
    IconDesigner = new javax.swing.JLabel("מעצב האייקון: עידן הרמן.");
    LogoDesigner = new javax.swing.JLabel("מעצב הלוגו: עומר דותן.");
    Eitiel = new javax.swing.JLabel("הקדשה חגיגית לאיתיאל, שבזכותו התוכנה התקדמה כ\"כ!");
    Eitan = new javax.swing.JLabel("תודה לאיתן שיעץ ועזר בהמון דברים.");
    
    creditsPanel.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
    creditsPanel.setBackground(c);
    Programmer.setFont(new java.awt.Font("Arial", 1, 16));
    IconDesigner.setFont(f);
    LogoDesigner.setFont(f);
    Eitan.setFont(f);
    Eitiel.setFont(new java.awt.Font("Arial", 1, 14));
    creditsPanel.setLayout(new javax.swing.BoxLayout(creditsPanel, 3));
    creditsPanel.add(Programmer);
    creditsPanel.add(IconDesigner);
    creditsPanel.add(LogoDesigner);
    creditsPanel.add(Eitan);
    creditsPanel.add(Eitiel);
    
    tabbedPane.addTab("קרדיטים", creditsPanel);
    tabbedPane.setMnemonicAt(3, 52);
    
    tabbedPane.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
    add(tabbedPane);
    add(codePanel, "West");
  }
  
  public void actionPerformed(java.awt.event.ActionEvent click) {
    if (click.getSource().equals(btn)) { btn();
    } else if (click.getSource().equals(lbl)) { lbl();
    } else if (click.getSource().equals(tb)) { tb();
    } else if (click.getSource().equals(txt)) { txt();
    } else if (click.getSource().equals(crtcd)) { crtcd();
    } else if (click.getSource().equals(chkbox)) { chkbox();
    } else if (click.getSource().equals(addPack)) { addPack();
    } else if (click.getSource().equals(removePack)) { removePack();
    } else if (click.getSource().equals(addImp)) { addImp();
    } else if (click.getSource().equals(removeImp)) removeImp();
    code = (code1 + tab + "public GUI() {" + sep + code2 + sep + code3 + sep + code4);
    jta.setText(createCode());
  }
  
  void insert(JComponent comp, String title) {
    String ot = " ,";
    String name = comp.getName();
    String cName = comp.getClass().getSimpleName();
    String superClass = comp.getClass().getSuperclass().getSimpleName();
    String design = "";
    if (comp.getFont().isBold()) { design = "Font.BOLD";
    } else if (comp.getFont().isItalic()) design = "Font.ITALIC"; else
      design = "Font.PLAIN";
    String font = "new Font(\"" + comp.getFont().getFamily() + "\"" + ot + design + ot + comp.getFont().getSize() + ")";
    code1 = (code1 + tab + "private " + cName + " " + name + ";" + sep);
    code2 = (code2 + tab + tab + name + " = new " + cName + "(" + title + ");" + sep);
    code3 = (code3 + tab + tab + name + ".setFont(" + font + ");" + sep);
    java.awt.Color color = superClass.equals("JContainer") ? comp.getBackground() : comp.getForeground();
    code3 = (code3 + tab + tab + name + ".setColor( new Color(" + color.getRed() + ot + color.getGreen() + ot + color.getBlue() + "));" + sep + tab + tab + sep);
    code4 = (code4 + tab + tab + "add(" + name + ");" + sep);
  }
  
  void btn() { title = ("\"" + javax.swing.JOptionPane.showInputDialog("הכנס כותרת כפתור") + "\"");
    JComponent temp = new JButton();
    temp.setName("btn" + cbtn);
    arr.add(temp);
    insert(arr.read(arr.size() - 1), title);
    cbtn += 1;
  }
  
  void lbl() { title = ("\"" + javax.swing.JOptionPane.showInputDialog("הכנס טקסט") + "\"");
    JComponent temp = new javax.swing.JLabel();
    temp.setName("lbl" + clbl);
    arr.add(temp);
    insert(arr.read(arr.size() - 1), title);
    clbl += 1;
  }
  
  void tb() { JComponent temp = new javax.swing.JTextArea();
    temp.setName("tb" + ctb);
    arr.add(temp);
    insert(arr.read(arr.size() - 1), "15, 10");
    ctb += 1;
  }
  
  void txt() { JComponent temp = new javax.swing.JTextField();
    temp.setName("txt" + ctxt);
    arr.add(temp);
    insert(arr.read(arr.size() - 1), "12");
    ctxt += 1;
  }
  
  void chkbox() { title = ("\"" + javax.swing.JOptionPane.showInputDialog("הכנס טקסט לתיבת הסימון") + "\"");
    JComponent temp = new javax.swing.JCheckBox();
    temp.setName("chkbox" + cchk);
    arr.add(temp);
    insert(arr.read(arr.size() - 1), title);
    cchk += 1;
  }
  
  void crtcd() { write(createCode()); }
  

  void addPack() { listModelPack.addElement(pack.getText()); }
  
  void removePack() {
    if (!listPack.isSelectionEmpty()) listModelPack.remove(listPack.getSelectedIndex());
  }
  
  void addImp() { listModelImp.addElement(imp.getText()); }
  
  void removeImp() {
    if (!listImp.isSelectionEmpty()) listModelImp.remove(listImp.getSelectedIndex());
  }
  
  String impToCode() { if (listModelImp.isEmpty()) return "";
    String ezer = " implements ";
    for (int i = 0; i < listModelImp.getSize(); i++) {
      ezer = ezer + (String)listModelImp.getElementAt(i);
      if (i != listModelImp.getSize() - 1) ezer = ezer + " ,";
    }
    return ezer;
  }
  
  String packToCode() { String ezer = "";
    for (int i = 0; i < listModelPack.getSize(); i++) {
      ezer = ezer + "import " + (String)listModelPack.getElementAt(i) + ";";
      ezer = ezer + sep;
    }
    return ezer;
  }
  
  String createCode() {
    String start = packToCode() + sep + 
      "public class GUI extends JFrame" + impToCode() + " {" + sep;
    String end = tab + "}" + sep + 
      tab + "public static void main(String[] args) {" + sep + 
      tab + tab + "GUI aminadav = new GUI();" + sep + 
      tab + tab + "aminadav.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);" + sep + 
      tab + tab + "aminadav.setTitle(\"Created by GUI Creator TM\");" + sep + 
      tab + tab + "aminadav.pack();" + sep + 
      tab + tab + "aminadav.setLayout(new FlowLayout());" + sep + 
      tab + tab + "aminadav.setVisible(true);" + 
      sep + tab + "}" + sep + "}";
    return start + code + end;
  }
  
  void write(String txt) { Integer n = Integer.valueOf(0);
    txt = txt.replaceAll(tab, "\t");
    java.io.PrintWriter out = null;
    java.io.File file = new java.io.File("GUI.java");
    for (int i = 2; file.exists(); i++) {
      file = new java.io.File("GUI" + i + ".java");
      n = Integer.valueOf(i);
    }
    try {
      out = new java.io.PrintWriter(file);
    } catch (java.io.FileNotFoundException localFileNotFoundException) {}
    if (n.intValue() != 0) {
      txt = txt.replaceAll("GUI", "GUI" + n);
      txt = txt.replaceFirst("GUI" + n + " Creator", "GUI Creator");
    }
    if ((!listModelImp.isEmpty()) && (
      (javax.swing.JOptionPane.showConfirmDialog(null, "תוכנית זו מכילה מימוש." + sep + "אם לא ייבאת את החבילה המתאימה בשביל המימוש, או לא מימשת את המימוש, תוכניתך לא תעבוד!") == 
      1) || 
      (javax.swing.JOptionPane.showConfirmDialog(null, "תוכנית זו מכילה מימוש." + sep + "אם לא ייבאת את החבילה המתאימה בשביל המימוש, או לא מימשת את המימוש, תוכניתך לא תעבוד!") == 
      2)))
      return;
    out.print(txt);
    out.close();
    String s = n.equals(Integer.valueOf(0)) ? "" : n.toString();
    javax.swing.JOptionPane.showMessageDialog(null, "הקובץ נשמר בהצלחה בשם: GUI" + s + ".java", "נשמר בהצלחה!", 1);
  }
  
  public void itemStateChanged(java.awt.event.ItemEvent check)
  {
    if (theme.isSelected()) Graphics("Windows"); else
      Graphics("Nimbus");
  }
  
  void Graphics(String LAF) {
    try { for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
        if (LAF.equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          SwingUtilities.updateComponentTreeUI(this);
          break;
        }
    } catch (Exception localException) {}
  }
  
  public static void Main(String[] args) {
    String title = "GUI Creator V";
    String credit = " By Ornos";
    double ver = 4.7D;
    GUI aminadav = new GUI();
    aminadav.Graphics("Nimbus");
    aminadav.pack();
    aminadav.setLayout(new java.awt.BorderLayout());
    aminadav.setResizable(false);
    aminadav.setLocationRelativeTo(null);
    aminadav.setDefaultCloseOperation(2);
    aminadav.setTitle(title + ver + credit);
    aminadav.setVisible(true);
  }
}