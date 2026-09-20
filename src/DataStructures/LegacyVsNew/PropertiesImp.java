package DataStructures.LegacyVsNew;

import java.util.Properties;
/*
* Properties class is an implementation of HasTable, each key and its corresponding value is a string  since it inherits
* from the HashTable we have functions as put and putAll, their use is strongly discouraged as caller can insert values
* which are not string. Instead setProperty method should be used to enter values in property class.
*
* */

public class PropertiesImp {

    Properties property = new Properties();
}
