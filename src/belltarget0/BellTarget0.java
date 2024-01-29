package belltarget0;

import java.awt.*;//imports packages needed to make canvas
import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BellTarget0 extends JPanel {

    public static void main(String[] args) {//main method ;0
        JFrame newWindow = new JFrame("GraphicsDemo1: Arcs and Colors");//names canvas?
        newWindow.setSize(800, 600);//sets dimensions of canvas
        newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allows cavas to close after execution?
        BellTarget0 canvas = new BellTarget0();//crates canvas
        newWindow.add(canvas);//adds canvas to method
        newWindow.setVisible(true);//makes it so that you can see the canvas

    }

    @Override
    public void paint(Graphics g) {//makes new method for canvas
        int width = getWidth();
        int height = getHeight();

//target
        Color blueWow = new Color(52, 184, 236);
        g.setColor(blueWow);
        g.fillOval(width / 2 - 250, height / 2 - 250, 500, 500);//fills oval with custom color
        g.setColor(white);
        g.fillOval(width / 2 - 200, height / 2 - 200, 400, 400);//fills oval with custom color
        Color yellowWow = new Color(254, 184, 19);
        g.setColor(yellowWow);//sets new shapes to custom c
        g.fillOval(width / 2 - 150, height / 2 - 150, 300, 300);//fills oval with custom color
        g.setColor(white);
        g.fillOval(width / 2 - 100, height / 2 - 100, 200, 200);//fills oval with custom color
        Color redWow = new Color(235, 87, 87);
        g.setColor(redWow);
        g.fillOval(width / 2 - 50, height / 2 - 50, 100, 100);//fills oval with custom color
//feather
        Polygon feather = new Polygon();
        feather.addPoint(675, 300);//pt 3 
        feather.addPoint(650, 280);//vertex pt 2
        feather.addPoint(675, 257);//starts here pt 1
        feather.addPoint(700, 280);//pt 5
        feather.addPoint(725, 300);//pt 4
        Color red = new Color(202, 89, 88);
        g.setColor(red);
        g.fillPolygon(feather);

        Polygon feather2 = new Polygon();
        feather2.addPoint(675, 257);//pt 3 
        feather2.addPoint(725, 257);//vertex pt 2
        feather2.addPoint(700, 280);//starts here pt 1
        g.fillPolygon(feather2);
//feather white top
        Polygon white = new Polygon();
        white.addPoint(679, 256);//pt 3 
        white.addPoint(680, 280);//vertex pt 1
        white.addPoint(685, 257);//starts here pt 1
        g.setColor(Color.WHITE);
        g.fillPolygon(white);
//feather white bottom
        Polygon white2 = new Polygon();
        white2.addPoint(687, 284);//pt 3 
        white2.addPoint(690, 300);//1
        white2.addPoint(705, 300);//starts here pt 1
        g.setColor(Color.WHITE);
        g.fillPolygon(white2);
//sharp part
        Color blackWow = new Color(66, 64, 63);
        g.setColor(blackWow);
        Polygon arrow = new Polygon();
        arrow.addPoint(400, 280);//bottom left
        arrow.addPoint(400, 278);//top left
        arrow.addPoint(410, 278);//top right
        arrow.addPoint(410, 280);//bottom right
        g.fillPolygon(arrow);
        //arrow black base
        g.fillArc(405, 274, 50, 10, 100, 360);//creates outline of an arc/incomplete semi circle
//arrow base BROWN
        Color lightBrown = new Color(156, 118, 75);//creates custom color
        g.setColor(lightBrown);//sets new shapes to custom color
        g.fillOval(420, 274, 300, 10);//creates outline of an arc/incomplete semi circle
        //sharp base BLACK
        g.setColor(blackWow);//sets new shapes to custom color
        g.fillOval(405, 274, 50, 10);//creates outline of an arc/incomplete semi circle        

    }

}
