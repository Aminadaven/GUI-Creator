import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

@SuppressWarnings("serial")
public class GUI extends JFrame implements ActionListener, ItemListener
{
  private JPanel buttonsPanel, codePanel, packPanel, packBottom, 
  impPanel, impBottom, creditsPanel;
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
  private JTextArea jta;
  private DefaultListModel<String> listModelPack;
  private DefaultListModel<String> listModelImp;
  private JList<String> listPack;
  private JList<String> listImp;
  private JScrollPane scrollerPack;
  private JScrollPane scrollerImp;
  private JScrollPane codeScroller;
  private JTextField pack;
  private JTextField imp;
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
  private Color c;
  private Color b;
  private Font f;
  private JTabbedPane tabbedPane;
  
  private JLabel Programmer;
  private JLabel IconDesigner;
  private JLabel LogoDesigner;
  private JLabel Eitiel;
  private JLabel Eitan;
  
  private Vector arr;
  private JCheckBox theme;
  private Dimension sizeBox;
  
  public GUI() {
    arr = new Vector();
    sep = System.lineSeparator();
    tab = "    ";
    
    c = new Color(15794175);
    b = new Color(6591981);
    f = new Font("Arial", 0, 12);
    getContentPane().setBackground(b);
    getContentPane().setFont(f);
    tabbedPane = new JTabbedPane();
    tabbedPane.setFont(f);
    sizeBox = new Dimension(350, 150);
    tabbedPane.setPreferredSize(sizeBox);
    
    buttonsPanel = new JPanel();
    btn = new JButton(Messages.getString("GUI.2")); //$NON-NLS-1$
    lbl = new JButton(Messages.getString("GUI.3")); //$NON-NLS-1$
    tb = new JButton(Messages.getString("GUI.4")); //$NON-NLS-1$
    txt = new JButton(Messages.getString("GUI.5")); //$NON-NLS-1$
    crtcd = new JButton(Messages.getString("GUI.6")); //$NON-NLS-1$
    theme = new JCheckBox(Messages.getString("GUI.7")); //$NON-NLS-1$
    chkbox = new JButton(Messages.getString("GUI.8")); //$NON-NLS-1$
    
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
    
    buttonsPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    buttonsPanel.setBackground(c);
    buttonsPanel.setLayout(new GridLayout(4, 3));
    buttonsPanel.add(btn);
    buttonsPanel.add(lbl);
    buttonsPanel.add(tb);
    buttonsPanel.add(txt);
    buttonsPanel.add(chkbox);
    buttonsPanel.add(crtcd);
    buttonsPanel.add(theme);
    
    tabbedPane.addTab(Messages.getString("GUI.13"), buttonsPanel); //$NON-NLS-1$
    tabbedPane.setMnemonicAt(0, 49);
    
    packPanel = new JPanel();
    listModelPack = new DefaultListModel<String>();
    listPack = new JList<String>(listModelPack);
    scrollerPack = new JScrollPane(listPack);
    packBottom = new JPanel();
    addPack = new JButton(Messages.getString("GUI.14")); //$NON-NLS-1$
    removePack = new JButton(Messages.getString("GUI.15")); //$NON-NLS-1$
    pack = new JTextField(14);
    
    listModelPack.addElement(Messages.getString("GUI.16")); //$NON-NLS-1$
    listModelPack.addElement(Messages.getString("GUI.17")); //$NON-NLS-1$
    listPack.setSelectionMode(0);
    listPack.setLayoutOrientation(0);
    listPack.setSelectedIndex(0);
    listPack.setVisibleRowCount(-1);
    scrollerPack.setPreferredSize(sizeBox);
    
    addPack.setFont(f);
    removePack.setFont(f);
    
    addPack.addActionListener(this);
    removePack.addActionListener(this);
    
    packPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    packPanel.setBackground(c);
    packBottom.setBackground(c);
    packPanel.setLayout(new BorderLayout());
    packPanel.add(scrollerPack, Messages.getString("GUI.18")); //$NON-NLS-1$
    packBottom.add(removePack);
    packBottom.add(pack);
    packBottom.add(addPack);
    packPanel.add(packBottom, Messages.getString("GUI.19")); //$NON-NLS-1$
    
    tabbedPane.addTab(Messages.getString("GUI.20"), packPanel); //$NON-NLS-1$
    tabbedPane.setMnemonicAt(1, 50);
    
    impPanel = new JPanel();
    addImp = new JButton(Messages.getString("GUI.21")); //$NON-NLS-1$
    removeImp = new JButton(Messages.getString("GUI.22")); //$NON-NLS-1$
    imp = new JTextField(14);
    listModelImp = new DefaultListModel<String>();
    listImp = new JList<String>(listModelImp);
    scrollerImp = new JScrollPane(listImp);
    impBottom = new JPanel();
    
    listModelImp.addElement(Messages.getString("GUI.23")); //$NON-NLS-1$
    listImp.setSelectionMode(0);
    listImp.setLayoutOrientation(0);
    listImp.setSelectedIndex(0);
    listImp.setVisibleRowCount(-1);
    scrollerImp.setPreferredSize(sizeBox);
    
    addImp.setFont(f);
    removeImp.setFont(f);
    
    addImp.addActionListener(this);
    removeImp.addActionListener(this);
    
    impPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    impPanel.setBackground(c);
    impBottom.setBackground(c);
    impPanel.setLayout(new BorderLayout());
    impBottom.add(removeImp);
    impBottom.add(imp);
    impBottom.add(addImp);
    impPanel.add(scrollerImp, Messages.getString("GUI.24")); //$NON-NLS-1$
    impPanel.add(impBottom, Messages.getString("GUI.25")); //$NON-NLS-1$
    
    tabbedPane.addTab(Messages.getString("GUI.26"), impPanel); //$NON-NLS-1$
    tabbedPane.setMnemonicAt(2, 51);
    
    codePanel = new JPanel();
    jta = new JTextArea(30, 40);
    codeScroller = new JScrollPane(jta);
    
    codePanel.setBackground(b);
    codePanel.add(codeScroller);
    jta.setFont(new Font(Messages.getString("GUI.27"), 0, 12)); //$NON-NLS-1$
    
    code = (code1 + tab + Messages.getString("GUI.28") + sep + code2 + code3 + code4); //$NON-NLS-1$
    jta.setText(createCode());
        
    tabbedPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    add(tabbedPane);
    add(codePanel, Messages.getString("GUI.29")); //$NON-NLS-1$
  }
  
  public void actionPerformed(ActionEvent click) {
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
    code = (code1 + tab + Messages.getString("GUI.30") + sep + code2 + sep + code3 + sep + code4); //$NON-NLS-1$
    jta.setText(createCode());
  }
  
  void insert(JComponent comp, String title) {
    String ot = " ,";
    String name = comp.getName();
    String cName = comp.getClass().getSimpleName();
    String design = "";
    if (comp.getFont().isBold()) design = Messages.getString("GUI.33"); //$NON-NLS-1$
    else if (comp.getFont().isItalic()) design = Messages.getString("GUI.34"); //$NON-NLS-1$
    else design = Messages.getString("GUI.35"); //$NON-NLS-1$
    String font = Messages.getString("GUI.36") + comp.getFont().getFamily() + Messages.getString("GUI.37") + ot + design + ot + comp.getFont().getSize() + Messages.getString("GUI.38"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    code1 = (code1 + tab + Messages.getString("GUI.39") + cName + " " + name + ";" + sep); //$NON-NLS-1$
    code2 = (code2 + tab + tab + name + Messages.getString("GUI.42") + cName + Messages.getString("GUI.43") + title + Messages.getString("GUI.44") + sep); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    code3 = (code3 + tab + tab + name + Messages.getString("GUI.45") + font + Messages.getString("GUI.46") + sep); //$NON-NLS-1$ //$NON-NLS-2$
    code4 = (code4 + tab + tab + Messages.getString("GUI.50") + name + Messages.getString("GUI.51") + sep); //$NON-NLS-1$ //$NON-NLS-2$
  }
  
  void btn() { 
	title = (Messages.getString("GUI.52") + JOptionPane.showInputDialog(Messages.getString("GUI.53")) + Messages.getString("GUI.54")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    JComponent temp = new JButton();
    temp.setName(Messages.getString("GUI.55") + cbtn); //$NON-NLS-1$
    arr.add(temp);
    insert(arr.read(arr.size() - 1), title);
    cbtn += 1;
  }
  
  void lbl() { 
	title = (Messages.getString("GUI.56") + JOptionPane.showInputDialog(Messages.getString("GUI.57")) + Messages.getString("GUI.58")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    JComponent temp = new JLabel();
    temp.setName(Messages.getString("GUI.59") + clbl); //$NON-NLS-1$
    arr.add(temp);
    insert(arr.read(arr.size() - 1), title);
    clbl += 1;
  }
  
  void tb() { 
	JComponent temp = new JTextArea();
    temp.setName(Messages.getString("GUI.60") + ctb); //$NON-NLS-1$
    arr.add(temp);
    insert(arr.read(arr.size() - 1), Messages.getString("GUI.61")); //$NON-NLS-1$
    ctb += 1;
  }
  
  void txt() { 
	  JComponent temp = new JTextField();
    temp.setName(Messages.getString("GUI.62") + ctxt); //$NON-NLS-1$
    arr.add(temp);
    insert(arr.read(arr.size() - 1), Messages.getString("GUI.63")); //$NON-NLS-1$
    ctxt += 1;
  }
  
  void chkbox() { 
	  title = (Messages.getString("GUI.64") + JOptionPane.showInputDialog(Messages.getString("GUI.65")) + Messages.getString("GUI.66")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    JComponent temp = new JCheckBox();
    temp.setName(Messages.getString("GUI.67") + cchk); //$NON-NLS-1$
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
  
  String impToCode() { 
	  if (listModelImp.isEmpty()) return Messages.getString("GUI.68"); //$NON-NLS-1$
    String ezer = Messages.getString("GUI.69"); //$NON-NLS-1$
    for (int i = 0; i < listModelImp.getSize(); i++) {
      ezer = ezer + (String) listModelImp.getElementAt(i);
      if (i != listModelImp.getSize() - 1) ezer = ezer + Messages.getString("GUI.70"); //$NON-NLS-1$
    }
    return ezer;
  }
  
  String packToCode() {
	  String ezer = Messages.getString("GUI.71"); //$NON-NLS-1$
	  for (int i = 0; i < listModelPack.getSize(); i++) {
      ezer = ezer + Messages.getString("GUI.72") + (String) listModelPack.getElementAt(i) + Messages.getString("GUI.73"); //$NON-NLS-1$ //$NON-NLS-2$
      ezer = ezer + sep;
      	}
    return ezer;
  }
  
  String createCode() {
    String start = packToCode() + sep + 
      Messages.getString("GUI.74") + impToCode() + Messages.getString("GUI.75") + sep; //$NON-NLS-1$ //$NON-NLS-2$
    String end = tab + Messages.getString("GUI.76") + sep +  //$NON-NLS-1$
      tab + Messages.getString("GUI.77") + sep +  //$NON-NLS-1$
      tab + tab + Messages.getString("GUI.78") + sep +  //$NON-NLS-1$
      tab + tab + Messages.getString("GUI.79") + sep +  //$NON-NLS-1$
      tab + tab + Messages.getString("GUI.80") + sep +  //$NON-NLS-1$
      tab + tab + Messages.getString("GUI.81") + sep +  //$NON-NLS-1$
      tab + tab + Messages.getString("GUI.82") + sep +  //$NON-NLS-1$
      tab + tab + Messages.getString("GUI.83") +  //$NON-NLS-1$
      sep + tab + Messages.getString("GUI.84") + sep + Messages.getString("GUI.85"); //$NON-NLS-1$ //$NON-NLS-2$
    return start + code + end;
  }
  
  void write(String txt) { 
	Integer n = Integer.valueOf(0);
    txt = txt.replaceAll(tab, Messages.getString("GUI.86")); //$NON-NLS-1$
    PrintWriter out = null;
    File file = new File(Messages.getString("GUI.87")); //$NON-NLS-1$
    for (int i = 2; file.exists(); i++) {
      file = new File(Messages.getString("GUI.88") + i + Messages.getString("GUI.89")); //$NON-NLS-1$ //$NON-NLS-2$
      n = Integer.valueOf(i);
    }
    try {
      out = new PrintWriter(file);
    } catch (FileNotFoundException localFileNotFoundException) {}
    if (n.intValue() != 0) {
      txt = txt.replaceAll(Messages.getString("GUI.90"), Messages.getString("GUI.91") + n); //$NON-NLS-1$ //$NON-NLS-2$
      txt = txt.replaceFirst(Messages.getString("GUI.92") + n + Messages.getString("GUI.93"), Messages.getString("GUI.94")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }
    out.print(txt);
    out.close();
    String s = n.equals(Integer.valueOf(0)) ? "" : n.toString();
    JOptionPane.showMessageDialog(null, Messages.getString("GUI.100") + s + Messages.getString("GUI.101"), Messages.getString("GUI.102"), 1); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
  }
  
  public void itemStateChanged(ItemEvent check)
  {
    if (theme.isSelected()) Graphics(Messages.getString("GUI.103")); else //$NON-NLS-1$
      Graphics(Messages.getString("GUI.104")); //$NON-NLS-1$
  }
  
  void Graphics(String LAF) {
    try {
    	for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
    	if (LAF.equals(info.getName())) {
    		UIManager.setLookAndFeel(info.getClassName());
    		SwingUtilities.updateComponentTreeUI(this);
    		break;
          }
    } catch (Exception localException) {}
  }
  
  public static void main(String[] args) {
    String title = Messages.getString("GUI.105"); //$NON-NLS-1$
    String credit = Messages.getString("GUI.106"); //$NON-NLS-1$
    double ver = 4.7D;
    GUI aminadav = new GUI();
    aminadav.Graphics(Messages.getString("GUI.107")); //$NON-NLS-1$
    aminadav.pack();
    aminadav.setLayout(new BorderLayout());
    aminadav.setResizable(false);
    aminadav.setLocationRelativeTo(null);
    aminadav.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aminadav.setTitle(title + ver + credit);
    aminadav.setVisible(true);
  }
}