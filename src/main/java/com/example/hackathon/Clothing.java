package com.example.hackathon;
import jakarta.persistence.*;


/**
 * Clothing iteraface and implementing classes
 * @author Garrett Jones
 * @version 1.0
 */
public interface Clothing {


    public String toStringType();
    public boolean rain();
    public int getStyleRange();
    public int getTempRange();
    public String getColor();

    @Entity
    @Table
    public class Shirt implements Clothing {
        @Id
        @SequenceGenerator(
                name = "student_sequence",
                sequenceName = "student_sequence",
                allocationSize = 1
        )

        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "student_sequence"
        )
        // Vars
        /**
         * Variables for shirt object
         */
        String type = "shirt";
        boolean rain;
        int styleRange;
        int tempRange;
        String color;

        /**
         * Constructor for shirt object
         * @param styleRange for shirt
         * @param tempRange for shirt
         * @param color of shirt
         */
        public Shirt(int styleRange, int tempRange, String color) {
            this (false, styleRange, tempRange, color);
        }

        /**
         * Constructor for shirt
         * @param rain if shirt can be worn in rain
         * @param styleRange for shirt
         * @param tempRange for shirt
         * @param color of shirt
         */
        public Shirt(boolean rain, int styleRange, int tempRange, String color) {
            this.tempRange = tempRange;
            this.styleRange = styleRange;
            this.color = color;
            this.rain = rain;
        }

        public Shirt() {

        }

        // Methods 

        /**
         * Get methods for shirt variables
         */
        public String toStringType(){return type;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }

    public class Shorts implements Clothing {
        /**
         * Variables for shirt object
         */
        String type = "shorts";
        boolean rain;
        int styleRange;
        int tempRange;
        String color;

        /**
         * Constructor for shorts
         * @param styleRange for shorts
         * @param tempRange for shorts
         * @param color of shorts
         */
        public Shorts(int styleRange, int tempRange, String color) {
            this (false, styleRange, tempRange, color);
        }

        /**
         * Constructor for shorts
         * @param rain if shorts can be worn in rain
         * @param styleRange for shorts
         * @param tempRange for shorts
         * @param color of shorts
         */
        public Shorts(boolean rain, int styleRange, int tempRange, String color) {
            this.tempRange = tempRange;
            this.styleRange = styleRange;
            this.color = color;
            this.rain = rain;
        }
        
        /**
         * Get methods for short variables
         */
        public String toStringType(){return type;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }

    public class Pants implements Clothing {
        /**
         * Variables for pants
         */
        String type = "pants";
        boolean rain;
        int styleRange;
        int tempRange;
        String color;

        /**
         * Constructor for pants
         * @param styleRange for pants
         * @param tempRange for pants
         * @param color of pants
         */
        public Pants(int styleRange, int tempRange, String color) {
            this (false, styleRange, tempRange, color);
        }

        /**
         * Constructor for pants
         * @param rain if pants can be worn in rain
         * @param styleRange for pants
         * @param tempRange for pants
         * @param color of pants
         */
        public Pants(boolean rain, int styleRange, int tempRange, String color) {
            this.tempRange = tempRange;
            this.styleRange = styleRange;
            this.color = color;
            this.rain = rain;
        }
        
        /**
         * Get methods for variables
         */
        public String toStringType(){return type;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }

    public class Jacket implements Clothing {
        /**
         * Variables for jacket
         */
        String type = "jacket";
        boolean rain;
        int styleRange;
        int tempRange;
        String color;

        /**
         * Constructor for jacket
         * @param styleRange for jacket
         * @param tempRange for jacket
         * @param color of jacket
         */
        public Jacket(int styleRange, int tempRange, String color) {
            this (false, styleRange, tempRange, color);
        }

        /**
         * Constructor for jacket
         * @param rain if jacket can be worn in rain
         * @param styleRange for jacket
         * @param tempRange for jacket
         * @param color of jacket
         */
        public Jacket(boolean rain, int styleRange, int tempRange, String color) {
            this.tempRange = tempRange;
            this.styleRange = styleRange;
            this.color = color;
            this.rain = rain;
        }
        
        /**
         * Get methods for variables
         */
        public String toStringType(){return type;}
        public boolean rain() {return rain;}
        public int getStyleRange() {return styleRange;}
        public int getTempRange() {return tempRange;}
        public String getColor() {return color;}
    }
}
