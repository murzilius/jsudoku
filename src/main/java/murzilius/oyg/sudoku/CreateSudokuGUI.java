package oyg.sudoku;

import java.lang.*;
import java.util.*;
import oyg.exceptions.*;
//import oyg.sudoku.*;

public class CreateSudokuGUI {
    //public MainForm form1;
    /** Creates a new instance of CreateSudokuGUI */
    private MainForm mainFormObject;
    private frame1 frame1Object;
    private Soduko SodukoBoard;
    public CreateSudokuGUI() {
        mainFormObject = new MainForm();
        frame1Object = new frame1();        
        frame1Object.setMainFormObject(mainFormObject);
        //SodukoBoard = new Soduko();
        
        frame1Object.setSodukoBoard(SodukoBoard);
        mainFormObject.setSodukobject(SodukoBoard);
        mainFormObject.setInitiatorObject(this);
        mainFormObject.setVisible(true);
        frame1Object.setVisible(true);
        NewGame(30);
        //mainFormObject.setFrame1Object(frame1Object);
    }
    
    public void NewGame(int level){
       
        SodukoBoard = new Soduko();
        frame1Object.setSodukoBoard(SodukoBoard);
        mainFormObject.setSodukobject(SodukoBoard);
        
        SodukoBoard.SodukoBuild(level);
        frame1Object.printSudokuBoard();
        
    }
    public static void main(String[] args){
        
        CreateSudokuGUI sudoku = new CreateSudokuGUI();
    }
} 
    
class frame1 extends javax.swing.JFrame {
    
    /** Creates new form frame1 */
    public frame1() {
        
        initComponents();
        
    }
    
                   
    private void initComponents() {
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        //jLabel1 = new javax.swing.JLabel();
        jLabel1 = new OJLabel[9][9];

        jTextField1.setText("jTextField1");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicy(getFocusTraversalPolicy());
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 2));
        setBounds(300,100,-1,-1);
        setResizable(false);
        
        addKeyListener(new java.awt.event.KeyAdapter() {
            /*public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyboardTyped(evt);
            }*/
            public void keyPressed(java.awt.event.KeyEvent evt) {
                KeyboardPressed(evt);
            }
        });
        
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(2, 500));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 0, -1, -1));

        jSeparator3.setPreferredSize(new java.awt.Dimension(500, 2));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jSeparator4.setPreferredSize(new java.awt.Dimension(500, 2));
        //jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 164, -1, -1));

        jSeparator5.setPreferredSize(new java.awt.Dimension(500, 2));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        jSeparator6.setPreferredSize(new java.awt.Dimension(500, 2));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, -1, -1));

        jSeparator7.setPreferredSize(new java.awt.Dimension(500, 2));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 329, -1, -1));

        jSeparator8.setPreferredSize(new java.awt.Dimension(500, 2));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 385, -1, -1));

        jSeparator9.setPreferredSize(new java.awt.Dimension(500, 2));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator10.setPreferredSize(new java.awt.Dimension(2, 500));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator11.setPreferredSize(new java.awt.Dimension(2, 500));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 0, -1, -1));

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator12.setPreferredSize(new java.awt.Dimension(2, 500));
        getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator13.setPreferredSize(new java.awt.Dimension(2, 500));
        getContentPane().add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 0, -1, -1));

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator14.setPreferredSize(new java.awt.Dimension(2, 500));
        getContentPane().add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 0, -1, -1));

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator15.setPreferredSize(new java.awt.Dimension(2, 500));
        getContentPane().add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 0, -1, -1));

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator16.setPreferredSize(new java.awt.Dimension(2, 500));
        getContentPane().add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator17.setPreferredSize(new java.awt.Dimension(2, 500));
        getContentPane().add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 0, -1, -1));

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator18.setPreferredSize(new java.awt.Dimension(2, 500));
        getContentPane().add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 0, -1, -1));

        jSeparator19.setPreferredSize(new java.awt.Dimension(500, 2));
        getContentPane().add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 166, -1, -1));

        jSeparator20.setPreferredSize(new java.awt.Dimension(500, 2));
        getContentPane().add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 331, -1, -1));
        
        int i = 0,j=0;
        for (i=0;i<jLabel1.length;i++) {
            for (j=0;j<jLabel1.length;j++) {
                jLabel1[i][j]=new OJLabel();
                jLabel1[i][j].setFont(new java.awt.Font("Serif", 1, 30));
                jLabel1[i][j].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1[i][j].setText("");
                int[] helperUserData = {i,j};
                jLabel1[i][j].setUserData(helperUserData);
                jLabel1[i][j].setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                /*jLabel1[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel1MouseClicked(evt);
                    }
                });*/
                
                getContentPane().add(jLabel1[i][j], new org.netbeans.lib.awtextra.AbsoluteConstraints((i*55), (j*55), 55, 55));

            }
        }
        pack();
    }
    // </editor-fold>                        

    private void KeyboardTyped(java.awt.event.KeyEvent evt) {
// TODO add your handling code here:
        char pressedKey = evt.getKeyChar();
        int numSelected;
        numSelected = (int)pressedKey;
        if (numSelected>=1 && numSelected<=9){
            mainForm.setNumSelected(numSelected);
        }
        
    }
    private void KeyboardPressed(java.awt.event.KeyEvent evt) {
// TODO add your handling code here:
        char pressedKey = evt.getKeyChar();
        int numSelected;
        numSelected = (int)pressedKey-48;
        if (numSelected>=1 && numSelected<=9){
            mainForm.setNumSelected(numSelected);
        }
        
    }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
// TODO add your handling code here:
        
        Object j = new Object();
        j = evt.getSource();
        int buttonClicked;
        buttonClicked = evt.getButton();
        if (buttonClicked==1){
            OJLabel l = new OJLabel();
            l = (OJLabel)j;
            AddNumToBoard(l);
        }
        if (buttonClicked==3){
            OJLabel l = new OJLabel();
            l = (OJLabel)j;
            AddPotentialNumber(l);
        }
        
 
    }                                    
  
    
    private void doNothingEvent(java.awt.event.MouseEvent evt){
    
    }
    
    private void AddNumToBoard(OJLabel jLabel){
        int numSelected = mainForm.getNumberSelected();
        String numToAdd = String.valueOf(numSelected);
        if (jLabel.getText().equals(numToAdd)){
            jLabel.setText("");
            try{
            SodukoBoard.AddToBoard(0, 
                    ((int[])jLabel.getUserData())[0], 
                    ((int[])jLabel.getUserData())[1]);
            } catch(exArrayOutOfRange e){};
        }
        else{
            jLabel.setText(numToAdd);
            try{
            SodukoBoard.AddToBoard(numSelected, 
                    ((int[])jLabel.getUserData())[0], 
                    ((int[])jLabel.getUserData())[1]);
            } catch(exArrayOutOfRange e){};
        }
        
        jLabel.removeAllPotentials();
        RefreshPotentials(jLabel);
        
    }
    //this method takes the arraylist from the label object and creates
    //potentials 
    private void RefreshPotentials(OJLabel jLabel){
        final int[] HORIZ = {1,15,30,45,1,1};
        final int[] VERT = {1,1,1,1,20,40};
        int i=0;
        int horizLabel = ((int[])jLabel.getUserData())[0];
        int vertLabel = ((int[])jLabel.getUserData())[1];
        ArrayList potentials = jLabel.getPotentials();
        ArrayList oldPotentials = jLabel.getOldPotentials();
        //remove old potentials
        for (i=0;i<oldPotentials.size();i++){
            OJLabel oldPotentialLabel = (OJLabel)oldPotentials.get(i);
            getContentPane().remove(oldPotentialLabel);
        }
        
        jLabel.removeAllOldPotentials();
        //add new potentials
        for (i=0;i<potentials.size();i++){
            OJLabel potentialLabel = (OJLabel)potentials.get(i);
            getContentPane().add(potentialLabel, 
                    new org.netbeans.lib.awtextra.AbsoluteConstraints
                    (HORIZ[i]+horizLabel*55+3, VERT[i]+vertLabel*55+3, -1, -1));
            
        }
        //getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 56, 55, 55));
        pack();
        getContentPane().repaint();
    }
    //this just add the label object to the parent label object container
    //does not draw the new object!!!
    private void AddPotentialNumber(OJLabel jLabel){
        
        
        int currPotentials = jLabel.getNumberOfPotentials();
        int newPotential = 0;
        int numSelected = mainForm.getNumberSelected();
        
        String numToAdd = String.valueOf(numSelected);
        if (currPotentials==6){
            jLabel.removePotential(5);
        }
        
        OJLabel potentialLabel = new OJLabel();
        potentialLabel.setText(numToAdd);
        potentialLabel.setDirectParent(jLabel);
        int index = jLabel.isPotentialExist(potentialLabel);
        if (index>=0){
            jLabel.removePotential(index);
        }
        else{
            jLabel.addPotential(potentialLabel);
        }   
        RefreshPotentials(jLabel);
    }
    public void setMainFormObject(MainForm mainFormObject){
        mainForm = mainFormObject;
    }
    public void setSodukoBoard(Soduko sodukoObject){
        SodukoBoard = sodukoObject;
    }
    
    
    public void printSudokuBoard(){
        int i,j;
        String text;
        int[][] tempSodukoBoard = SodukoBoard.StateBoard();
        for (i=0;i<jLabel1.length;i++) {
            for (j=0;j<jLabel1.length;j++) {
                jLabel1[i][j].removeAllPotentials();
                RefreshPotentials(jLabel1[i][j]);
                jLabel1[i][j].setForeground(new java.awt.Color(0, 0, 0));
                if (tempSodukoBoard[i][j]==0){
                    jLabel1[i][j].setText("");
                    java.awt.event.MouseListener[] listener = jLabel1[i][j].getMouseListeners();
                    if (listener.length==0){
                        jLabel1[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel1MouseClicked(evt);
                            }
                        });
                        
              
                     }
                }
                else{
                    java.awt.event.MouseListener[] listener = jLabel1[i][j].getMouseListeners();
                    while (listener.length>0){
                        jLabel1[i][j].removeMouseListener(listener[0]);
                        listener = jLabel1[i][j].getMouseListeners();
                    }
                    text = String.valueOf(tempSodukoBoard[i][j]);
                    jLabel1[i][j].setText(text);
                    jLabel1[i][j].setForeground(new java.awt.Color(0, 102, 153));
                    
                        
                       
                }
                
            }
        }
        
    }
    // Variables declaration - do not modify 
    private OJLabel[][] jLabel1;
    //private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration    
    private MainForm mainForm;
    private Soduko SodukoBoard;
}


///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////



class OJLabel extends javax.swing.JLabel{
    private Object UserData;
    private int hotizIndex,vertIndex;
    //private int numOfPotentials;
    private ArrayList potentials = new ArrayList();
    private ArrayList oldPotentials = new ArrayList();
    private Object parent;
    
    public void setUserData(Object userdata){
        UserData = userdata;
        
    }
    public Object getUserData(){
        return UserData;
    }
    public void setHorizontalIndex(int index){
        hotizIndex = index;
        
    }
    public int getHorizontalIndex(){
        return hotizIndex;
        
    }
    public void setVerticalIndex(int index){
        vertIndex = index;
        
    }
    public int getVerticalIndex(){
        return vertIndex;
        
    }
/*
    public void setNumberOfPotentials(int number){
        numOfPotentials = number;
        
        
    }*/
    public int getNumberOfPotentials(){
        return potentials.size();
        
    }
    public boolean addPotential(javax.swing.JLabel label){
        return potentials.add(label);
  
    }
    public void removePotential(int index){
        boolean res = oldPotentials.add(potentials.get(index));
        potentials.remove(index);
        
    }
    public boolean removePotential(javax.swing.JLabel label){
        boolean res = oldPotentials.add(potentials.get(potentials.indexOf(label)));
        if (res) {
            return potentials.remove(label);
        }
        else{
            return false;
        }
        
    }
    public ArrayList getPotentials(){
        return potentials;
    }
    public void setDirectParent(Object parentObject){
        parent = parentObject;
    }
    public Object getDirectParent() {
        return parent;
    }
    public ArrayList getOldPotentials(){
        return oldPotentials;
    }
    public void removeAllPotentials(){
        int i=0;
        oldPotentials.clear();
        for (i=0;i<potentials.size();i++){
            oldPotentials.add(potentials.get(i));
        }
        potentials.clear();
        
    }
    public void removeAllOldPotentials(){
        oldPotentials.clear();
    }
    public int isPotentialExist(javax.swing.JLabel label){
        int currPotentialNumber = Integer.parseInt(label.getText());
        int potentialNumber;
        int i=0;
        for (i=0;i<getNumberOfPotentials();i++){
            potentialNumber = Integer.parseInt(((OJLabel)potentials.get(i)).getText());
            if (potentialNumber==currPotentialNumber){
                
                return i;
            }
        }
        return -1;
    }
}