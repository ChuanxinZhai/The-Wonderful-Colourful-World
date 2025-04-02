package cw3;

import java.awt.Color;

/**
 * CPT105 2020 Coursework 3 Sample Methods
 */
public class CW3_Example {
    
    // Returns a new picture that is an upside down version the given picture.
    public static Picture upsideDown(Picture picture) {
      
        Picture newPic = new Picture(width, height);
        return newPic;
    }
    
    // Returns a new picture that is a grayscale version the given picture.
    public static Picture grayScale(Picture picture) {
        
        Picture newPic = new Picture(width, height);
        return newPic;
    }
    
    
    public static void main(String[] args) {
        Picture andrew = new Picture("src\\cw3\\Andrew.png");
        andrew.show();
        //upsideDown(andrew).show();
        //grayScale(andrew).show();
                
        //Picture udAndrew = new Picture("src\\cw3\\Expected\\UpsideDownAndrew.png");
        //System.out.println(udAndrew.equals(upsideDown(andrew)));
        
        //Picture grayAndrew = new Picture("src\\cw3\\Expected\\GrayAndrew.png");
        //System.out.println(grayAndrew.equals(grayScale(andrew)));
        
    }
    
}
