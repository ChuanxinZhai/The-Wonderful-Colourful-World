# The-Wonderful-Colourful-World

### Part A - Image Modifications

##### Part A.1 - Tilt

Write a method Picture tilt(Picture picture) to tilt a picture by rotating the picture 30 degrees clockwise. To rotate a picture by θ radians counterclockwise, copy the color of each pixel (cols, rows) in the source picture to a target pixel (colt, rowt) whose coordinates (in int) are given by the following formulas:

![image](https://github.com/user-attachments/assets/a502bb5e-f12c-4bc0-8231-ab0fbd2269e6)

where colc and rowc are the coordinates (in double) of the center of the width-by-height picture, computed by:

![image](https://github.com/user-attachments/assets/8fed9c43-e6e0-44d5-8664-976b885d5a6d)

Note that you should only copy the pixel if the target pixel is in bounds, so as not to change the dimension of the image. Use black for target pixels with no copied color.
For example, an original Andrew and the tilted Andrew is shown below.

![image](https://github.com/user-attachments/assets/a8531642-3413-4580-b51f-878b53fec137)
![image](https://github.com/user-attachments/assets/7096a1ea-44cb-40b2-a80d-fbbc0a082ddd)

##### Part A.2 - Emboss

Write a method Picture emboss(Picture picture) to add an emboss style effect to a picture by applying the following kernel (see Appendix 1 for information on a Kernel Filter’:

![image](https://github.com/user-attachments/assets/8be3116d-40ef-4a0f-9848-67bc4a47d2b6)


![image](https://github.com/user-attachments/assets/41c80e0d-1168-4176-8213-801640965bef)
![image](https://github.com/user-attachments/assets/23e24063-9c8e-456e-bea7-92b9ddff0bf2)


##### Part A.3 - Blur

Write a method Picture blur(Picture picture) to blur a picture by applying the following kernel (one-ninth in a 9-by-9 diagonal matrix). This means applying the diagonal matrix, and then dividing the result by 9:

![image](https://github.com/user-attachments/assets/06db026e-2975-48a6-ab44-d8356a55dcce)

![image](https://github.com/user-attachments/assets/a0ca2de8-7e12-4e6e-ae8c-823b8339c706)
![image](https://github.com/user-attachments/assets/083fd8fc-02d3-460d-bce8-84fcee8fb793)

##### Part A.4 - Edge Detection

Write a method Picture edge(Picture picture) to perform edge detection of a picture as follows. First convert the picture into a grayscale picture. You can achieve that by simply calling the static grayScale(picture) method, which is provided as part of the example code, and is similar to the method created in your lab classes. Next, apply these two kernels to each grayscale component (you only need to do one computation since all three color components of a grayscale picture are the same) of a pixel, the following:

![image](https://github.com/user-attachments/assets/0b719b25-c3c4-46b6-bdc5-aaecf4491e22)

to obtain the value Gx, and the following

![image](https://github.com/user-attachments/assets/625b4c3e-bbec-4458-98e4-e8103853a862)

to obtain the value Gy.

Finally, convert to int with casting and clamp the value G = Gx2 + Gy2 ,
and then set the color of that pixel to 255 – G.

![image](https://github.com/user-attachments/assets/7036f11f-3eb3-4764-9bb9-7521fce182e7)
![image](https://github.com/user-attachments/assets/978df657-6966-4ed4-9513-2b6cc3b7dc96)








