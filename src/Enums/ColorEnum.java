public enum ColorEnum {
   BLACK("Black"),
   BLUE("Blue"),
   GRAY("Gray"),
   RED("Red"),
   SILVER("Silver"),
   WHITE("White");
   // Add more color options as needed

   private final String colorName;

   private ColorEnum(String colorName) {
      this.colorName = colorName;
   }

   public String getColorName() {
      return colorName;
   }

   // Optionally, you can add a static method to get a ColorEnum from a string
   public static ColorEnum fromString(String colorName) {
      for (ColorEnum color : ColorEnum.values()) {
         if (color.getColorName().equalsIgnoreCase(colorName)) {
            return color;
         }
      }
      return null; // Color not found
   }
}