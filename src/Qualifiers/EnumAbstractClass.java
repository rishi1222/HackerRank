package Qualifiers;

/*It is possible for a Java enum class to have abstract methods too. If an enum class has an abstract method, then each instance of the
enum class must implement it. Here is a Java enum abstract method example:
* Implementing business logic inside the abstract enum class can be one of the implementation use ENUM abstract class
* ENUM can implement Java Interfaces
 *  */

public enum EnumAbstractClass {
    HIGH{
        @Override
        public String asLowerCase() {
            return HIGH.toString().toLowerCase();
        }
    },
    MEDIUM{
        @Override
        public String asLowerCase() {
            return MEDIUM.toString().toLowerCase();
        }
    },
    LOW{
        @Override
        public String asLowerCase() {
            return LOW.toString().toLowerCase();
        }
    };

    public abstract String asLowerCase();

    public static void main(String[] args){
        for(EnumAbstractClass abstractValues : EnumAbstractClass.values()){
            System.out.println(abstractValues.asLowerCase());
        }
    }
}
