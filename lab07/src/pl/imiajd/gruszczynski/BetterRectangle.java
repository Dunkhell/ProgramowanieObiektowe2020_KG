package pl.imiajd.gruszczynski;

import org.w3c.dom.css.Rect;

import java.awt.*;

public class BetterRectangle extends Rectangle {

    public double getPerimeter(){
        double obw= this.height*2+this.width*2;
      return obw;
    }
    public double getArea(){
        double pole= this.width*this.height;
        return pole;
    }

}
