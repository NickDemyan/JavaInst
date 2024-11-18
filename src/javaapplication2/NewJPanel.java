package javaapplication2;
import java.awt.Panel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class NewJPanel extends Panel {
    private int myX;
    private int myY;
    private int mySize;
    
    public void paint(Graphics g){
    
    g.setColor(Color.red);
    g.fillRect(80, 85, 120, 60);
    g.setColor(Color.black);
    g.fillRect(200, 145, 120, 60);
    g.setColor(Color.blue);
    g.fillOval(140, 85, 120, 120);
    }
    
    
    public NewJPanel(){
        initComponents();
                }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

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

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch (evt.getKeyCode()){
            case KeyEvent.VK_RIGHT:
                if (njp.getMyX()>0){
                    njp.setMyX(njp.getMyX()-50);
                }
                break;
            case KeyEvent.VK_LEFT:
                if (njp.getMyX()>0){
                    njp.setMyX(njp.getMyX()-50);
                }
                break;
        case KeyEvent.VK_UP:
                if (njp.getMyX()>0){
                    njp.setMyX(njp.getMyX()-50);
                }
                break;
               
        case KeyEvent.VK_DOWN:
                if (njp.getMyX()>0){
                    njp.setMyX(njp.getMyX()-50);
                }
                break;
        default:
            throw new AssertionError();
        }
        repaint();
    }//GEN-LAST:event_formKeyPressed

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
