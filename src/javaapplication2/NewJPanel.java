package javaapplication2;
import java.awt.Panel;
import java.awt.Graphics;
import java.awt.Color;

public class NewJPanel extends Panel {
    private int myX;
    private int myY;
    private int mySize;
    
    public void paint(Graphics g){
    g.setColor(Color.black);
    g.fillOval(60, 105, 120, 100);
    g.setColor(Color.black);
    g.fillOval(45, 105, 30, 100);
    g.setColor(Color.red);
    g.fillOval(130, 105, 30, 100);
    }
    
    
    public NewJPanel(){
        initComponents();
                }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return the myX
     */
    public int getMyX() {
        return myX;
    }

    /**
     * @param myX the myX to set
     */
    public void setMyX(int myX) {
        this.myX = myX;
    }

    /**
     * @return the myY
     */
    public int getMyY() {
        return myY;
    }

    /**
     * @param myY the myY to set
     */
    public void setMyY(int myY) {
        this.myY = myY;
    }

    /**
     * @return the mySize
     */
    public int getMySize() {
        return mySize;
    }

    /**
     * @param mySize the mySize to set
     */
    public void setMySize(int mySize) {
        this.mySize = mySize;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
