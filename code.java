CPT105 2020 CW3 Part C_2
------------------------------------------------------------------------------------

Name       : Chuanxin.Zhai
Student ID : 1929631

------------------------------------------------------------------------------------

Copy paste ALL the content of your CW3_Part_B.java below the line ==================

In particular, it contains and must match the two methods that you submit in Part B.

====================================================================================
import java.awt.Color;
// DO NOT IMPORT ANY OTHER LIBRARY

/**
 * CPT105 2020 Coursework 3 Part B.1
 */
public class CW3_Part_B {
    
    /****************
     * CW3 Part B.1 *
     ****************/
    
    // Return the original picture and the positionally tranformed picture, side-by-side
    public static Picture positionalTransform(Picture picture) {
        int height = picture.height();
        int width = picture.width();
        Picture newPicture1 = new Picture(width*2, height);
        for (int col = 0; col < width; col++) {
        for (int row = 0; row < height; row++) {
                Color color = picture.getColor(col, row);
                newPicture1.setColor(col, row, color);
            }
        }
        // Your code here
        for (int col = 0; col < width; col++) {
        for (int row = 0; row < height; row++) {
            int colt = width-1-col;
                int rowt = (int) (Math.sin(Math.toRadians(colt * 6)) * 10+ row);
                if (colt >= 0 && colt < width && rowt >= 0 && rowt < height) {
                    Color color = picture.getColor(colt, height-1-rowt);
                    newPicture1.setColor(col+width-1, row, color);
                }
        }
        }
        
        
        
     return    newPicture1;
    }
    public static Picture colorTransform(Picture picture) {
        
        // Your code here
        int height = picture.height();
        int width = picture.width();
        int col1, row1;
        Picture newPicture = new Picture(width*2, height);
        Picture newPicture1 = new Picture(width, height);
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color color = picture.getColor(col, row);
                newPicture.setColor(col, row, color);
            }
        }
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                int r = picture.getColor(col, row).getRed();
                int g = picture.getColor(col, row).getGreen();
                int b = picture.getColor(col, row).getBlue();
                int R = r+50;
                if (R > 255) {
                    R = 255;
                }
                if (R < 0) {
                    R = 0;
                }
                int G = 255 - g;
                if (G > 255) {
                    G = 255;
                }
                if (G < 0) {
                    G = 0;
                }
                int B = 255-b;
                if (B > 255) {
                    B = 255;
                }
                if (B < 0) {
                    B = 0;
                }

                newPicture1.setColor(col, row, new Color(R, G, B));
            }
        }
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                int range = (int) (Math.random() * 10 * (Math.random() > 0.5 ? 1 : -1)) + 1;
                int colt = col + range;
                int rowt = row + range;
                if (colt < 0) {
                    colt = width + colt;
                }
                if (colt > width - 1) {
                    colt = colt - width;
                }
                if (rowt < 0) {
                    rowt = height + rowt;
                }
                if (rowt > height - 1) {
                    rowt = rowt - height;
                }
                if (colt >= 0 && colt < width && rowt >= 0 && rowt < height) {
                    Color color = newPicture1.getColor(colt, rowt);
                    newPicture.setColor(col+width-1, row, color);
                }
            }
        }

        return newPicture;
        
        
         
    }
	
	// DO NOT MODIFY THE MAIN METHOD
    public static void main(String[] args) {
        
        Picture andrew = new Picture("src\\cw3\\Andrew.png");
        //positionalTransform(andrew).show();
        colorTransform(andrew).show();
    }
    
}



