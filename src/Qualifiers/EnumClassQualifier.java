package Qualifiers;

public enum EnumClassQualifier {
        HIGH  (3),  //calls constructor with value 3
        MEDIUM(2),  //calls constructor with value 2
        LOW   (1)  ; //calls constructor with value 1
         // semicolon needed when fields / methods follow


        private final int levelCode;

    EnumClassQualifier(int levelCode) {
            this.levelCode = levelCode;
        }

        public int getLevelCode() {
            return this.levelCode;
        }

        public static void main(String[] args){
            System.out.println(EnumClassQualifier.HIGH.getLevelCode());
            System.out.println(EnumClassQualifier.MEDIUM.getLevelCode());
            System.out.println(EnumClassQualifier.LOW.getLevelCode());
        }
}
