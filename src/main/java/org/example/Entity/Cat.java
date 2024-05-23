package org.example.Entity;

import java.awt.image.BufferedImage;

public class Cat{

    private int x;
    private BufferedImage image;
    private boolean isVisible;

    public Cat(int x, BufferedImage image, boolean isVisible){
        this.x = x;
        this.image = image;
        this.isVisible = isVisible;
    }

    public void move(int dist){
        if( x + dist > 0){
            x += dist;
        }
    }

    public void switchVisibility(){
        isVisible = !isVisible;
    }

    public int x(){
        return x;
    }

    public BufferedImage image(){
        return image;
    }

    public boolean isVisible(){
        return isVisible;
    }
};
