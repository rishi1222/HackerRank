package WebServicesTest;

/*
* REST Assured vs Apache HttpClient and RestTemplate
* REST ASSURED
* REST Assured - is a high level Java DSL (Domain Specific Language) for simplified testing of Rest base Services
* built over HTTP
* HTTP CLIENT
* On the other hand HTTP Client is a low level client for simplifying Http Communication , In fact HTTP Client
* is used by Rest-Assured under the hood for HTTP communication
*
* @Test
* public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
* given().
*   when().
*       get("http://ergast.com/api/f1/2017/circuits.json").
*           then().
*               assertThat().
*                       body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
*                       }
*
*   The fluent API used by the Rest Assured supports the familiar GIVEN/WHEN/THEN syntax from BDD
*   resulting in test which that is easy to to read and takes care of everything (setup, execution and verification)
*   just with a single line of code
*
*
*   The verification part of the test does the following
*   1) Captures the (JSON) response from the API
*   2) Queries all the elements called circuitId using the Groovy GPATH expression
*      "MRDATA.CircuitTable.Circuits.CircuitsID"
*   3) Verifies the resulting collection of circuitId elements has size 20
*
*   Validating Technical response data
*
*   1) The response status code is equal to 200
*   2) The response content type (telling the receiver of the response how to interpret the response body)
*      equals "apppication/json"
*   3) The value of the response header is "Content-Length" equals "4567"
*
*
*   @Test
*   public void test_ResponseHeaderData_ShouldBeCorrect() {
*   given().
*       when().
*           get("http://ergast.com/api/f1/2017/circuits.json").
*               then().
*               assertThat().
*               statusCode(200).
*           and().
*               contentType(ContentType.JSON).
*           and().
*               header("Content-Length",equalTo("4567"));
*               }

*/