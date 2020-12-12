package com.coffeepoweredcrew.proxy;

import javafx.geometry.Point2D;
//Proxy class.
public class ImageProxy implements Image {

    // this is a standing object that will be used as much as possible and the Real Object will be created only when is necessary
    
    private BitmapImage image; // pointer to the Real Object

    private String name;

    private Point2D location;

    public ImageProxy (String name) {
        this.name = name;
    }

    @Override
    public void setLocation (Point2D point2d) {

        if (image != null) {
            return image.getLocation();
        } 

        return location;

    }

    @Override
    public Point2D getLocation () {

        if (image != null) {
            image.setLocation(point2d);
        } else {
            location = point2d;
        }
        
    }

    @Override
    public void render () {

        if (image == null) {
            image = new BitmapImage(name);

            if (location != null) {
                image.setLocation(location);
            }
        }

        image.render();

    }

}
