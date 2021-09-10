/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.image.datauri;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Saulo
 */
public class ExampleDataURI {

    public static void main(String[] args) throws Exception {
        int sz = 500;
        BufferedImage image = new BufferedImage(sz, sz, BufferedImage.TYPE_INT_ARGB);

        // paint the image..
        Graphics2D g = image.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.BLUE);
        for (int ii = 0; ii < sz; ii += 15) {
            g.drawOval(ii, ii, sz - ii, sz - ii);
        }
        g.dispose();

        // convert the image
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "png", baos);
        System.out.println("baos.toByteArray() " + baos.toByteArray());
        System.out.println("baos.toByteArray().length " + baos.toByteArray().length);
        String data = DatatypeConverter.printBase64Binary(baos.toByteArray());
        String imageString = "data:image/png;base64," + data;
        String html
                = "<html><body><img src='" + imageString + "'></body></html>";

        // write the HTML
        File f = new File("image.html");
        FileWriter fw = new FileWriter(f);
        fw.write(html);
        fw.flush();
        fw.close();

        // display the HTML
        Desktop.getDesktop().open(f);
    }
}
