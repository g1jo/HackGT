package com.example.hackathon;
public interface Clothing {
    public String toStringType();
    public boolean rain();
    public int getStyleRange();
    public int getTempRange();
    public String getColor();


    public class Shirt implements Clothing {
        // Vars
        String type = "shirt";
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
        public String toStringType(){return type;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }

    public class Shorts implements Clothing {
        // Vars
        String type = "shorts";
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
        public String toStringType(){return type;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }

    public class Pants implements Clothing {
        // Vars
        String type = "pants";
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
        public String toStringType(){return type;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }

    public class Jacket implements Clothing {
        // Vars
        String type = "jacket";
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
        public String toStringType(){return type;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }
}
