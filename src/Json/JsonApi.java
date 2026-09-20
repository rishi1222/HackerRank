package Json;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.Json;
import javax.json.stream.JsonParser;

/*
* Json(Java Script Object Notation) is a lightweight , text-based, language-independent data exchange format that is easy for
* humans and machines to read and write. JSON can represent two structured types: objects and arrays. An object is an unordered collection of zero or more name/value pairs.
* An array is an ordered sequence of zero or more values. These values can be strings, numbers, booleans , null and these these two structural type
 * {
    "firstName": "John",
    "lastName": "Smith",
    "age": 25,
    "address": {
        "streetAddress": "21 2nd Street",
        "city": "New York",
        "state": "NY",
        "postalCode": 10021
    },
    "phoneNumbers": [
        {
            "type": "home",
            "number": "212 555-1234"
        },
        {
            "type": "fax",
            "number": "646 555-4567"
        }
    ]
}

JSON is often used in Ajax application, configurations , databases , and RESTFUL web services. All popular websites offer JSON
and the data exchange format with the RESTFUL web services

JSON PROCESSING
The java API for JSON processing provides portable API to parse , generate , transform, and query JSON using object model and Streaming API

Object Model API
----------------

Object model API is same as Document Object Model API for XML. It is a high - level API that provides immutable object models for JSON objects and Array Structures. These JSON structures are represented as object models using Java types JsonObject and Json Array

JsonObject - Provides a Map view to access the unordered collection of zero or more name/value pairs from model.
JsonArray - Provides a List view to access the ordered sequence of zero or more values from model.

Table 1. Main classes in the object model API
Class or Interface                        Description
Json                                      Contains static methods to create JSON readers, writers, builders, and their factory objects.
JsonGenerator                             Writes JSON data to a stream one value at a time.
JsonReader                                Reads JSON data from a stream and creates an object model in memory.

JsonObjectBuilder
JsonArrayBuilder                          Create an object model or an array model in memory by adding values from application code.

JsonWriter                                Writes an object model from memory to a stream.

JsonValue
JsonObject
JsonArray
JsonString
JsonNumber                                 Represent data types for values in JSON data.

JsonObject, JsonArray, JsonString, and JsonNumber and subtypes of JsonValue. These are contacts defined in the API for null, true and false JSON values.

The object model API uses builder pattern to create these model from scratch. Application code can use the interface JSOnObjectBuilder
to create models that represent JSON objects. The resulting model of JsonObject.

Application code can use the interface JsonArrayBuilder to create models that represents JSON arrays. The resulting model is of type JsonArray.

The Streaming API
-----------------

The Streaming API is similar to the Streaming API for XML (Stax) and consists of the interfaces JsonParser and JsonGenerator.
JsonParser contains methods to parse JSON data using the streaming model.
----------
JsonGenerator contains methods to write JSON data to an output source.
-------------


Class or Interface                             Description
Json                                           Contains static methods to create JSON parsers, generators, and their factory objects.
JsonParser                                     Represents an event-based parser that can read JSON data from a stream.
JsonGenerator                                  Writes JSON data to a stream one value at a time.

JsonParser provides forward , read-only-access to JSON data using the pull parsing programming model.In this model the application code controls the thread and calls methods in the parser interface to move the parser forward or to obtain JSON data from the current state of the parser.

JsonGenerator provides methods to write JSON data to a stream. The generator can be used to write name/value pairs in JSON objects and values in JSON arrays.

*/

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonApi {

    public static void main(String[] args) {

        URL url;
        InputStream is = null;

        {
            try {
                url = new URL("https://graph.facebook.com/search?q=java&type=post");


                is = url.openStream();


                JsonReader rdr = Json.createReader(is);

                {
                    JsonObject obj = rdr.readObject();
                    JsonArray results = obj.getJsonArray("data");
                    for (JsonObject result : results.getValuesAs(JsonObject.class)) {
                        System.out.print(result.getJsonObject("from").getString("name"));
                        System.out.print(": ");
                        System.out.println(result.getString("message", ""));
                        System.out.println("-----------");

                    }

                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        JsonParser parser = Json.createParser(is);


        while (parser.hasNext()) {
            JsonParser.Event e = parser.next();
            if (e == JsonParser.Event.KEY_NAME) {
                switch (parser.getString()) {
                    case "name":
                        parser.next();
                        System.out.print(parser.getString());
                        System.out.print(": ");
                        break;
                    case "message":
                        parser.next();
                        System.out.println(parser.getString());
                        System.out.println("---------");
                        break;

                }

            }

        }
    }
}