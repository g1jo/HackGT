package com.example.hackathon;
public interface Clothing {
    public boolean isTop();
    public boolean isBottom();
    public boolean rain();
    public int getStyleRange();
    public int getTempRange();
    public String getColor();


    public class Shirt implements Clothing {
        // Vars
        boolean rain;
        int styleRange;
        int tempRange;
        String color;

        // Constructors
        public Shirt(int styleRange, int tempRange, String color) {
            this (false, styleRange, tempRange, color);
        }
        public Shirt(boolean rain, int styleRange, int tempRange, String color) {
            this.tempRange = tempRange;
            this.styleRange = styleRange;
            this.color = color;
            this.rain = rain;
        }
        
        // Methods 
        public boolean isTop() {return true;}
        public boolean isBottom() {return false;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }

    public class Shorts implements Clothing {
        // Vars
        boolean rain;
        int styleRange;
        int tempRange;
        String color;

        // Constructors
        public Shorts(int styleRange, int tempRange, String color) {
            this (false, styleRange, tempRange, color);
        }
        public Shorts(boolean rain, int styleRange, int tempRange, String color) {
            this.tempRange = tempRange;
            this.styleRange = styleRange;
            this.color = color;
            this.rain = rain;
        }
        
        // Methods 
        public boolean isTop() {return false;}
        public boolean isBottom() {return true;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }

    public class Pants implements Clothing {
        // Vars
        boolean rain;
        int styleRange;
        int tempRange;
        String color;

        // Constructors
        public Pants(int styleRange, int tempRange, String color) {
            this (false, styleRange, tempRange, color);
        }
        public Pants(boolean rain, int styleRange, int tempRange, String color) {
            this.tempRange = tempRange;
            this.styleRange = styleRange;
            this.color = color;
            this.rain = rain;
        }
        
        // Methods 
        public boolean isTop() {return false;}
        public boolean isBottom() {return true;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }

    public class Jacket implements Clothing {
        // Vars
        boolean rain;
        int styleRange;
        int tempRange;
        String color;

        // Constructors
        public Jacket(int styleRange, int tempRange, String color) {
            this (false, styleRange, tempRange, color);
        }
        public Jacket(boolean rain, int styleRange, int tempRange, String color) {
            this.tempRange = tempRange;
            this.styleRange = styleRange;
            this.color = color;
            this.rain = rain;
        }
        
        // Methods 
        public boolean isTop() {return true;}
        public boolean isBottom() {return false;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }
}
