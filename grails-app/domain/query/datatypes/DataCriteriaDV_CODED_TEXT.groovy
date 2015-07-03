package query.datatypes

import query.DataCriteria

class DataCriteriaDV_CODED_TEXT extends DataCriteria {

    // Comparison values
    List codeValues
    String terminologyIdValue
    String valueValue
    
    // Comparison operands
    String codeOperand
    String terminologyIdOperand
    String valueOperand
    
    DataCriteriaDV_CODED_TEXT()
    {
       rmTypeName = 'DV_CODED_TEXT'
    }
   
    static hasMany = [codeValues: String]
    
    static constraints = {
    }
    
    /**
     * Metadata that defines the types of criteria supported to search 
     * by conditions over DV_CODED_TEXT.
     * @return
     */
    static List criteriaSpec()
    {
       return [
          [
             code: [eq: 'value'], // operand eq can be applied to attribute code and the reference value is a single value
             terminologyId: [eq: 'value']
          ],
          [
             code: [in_list: 'list'], // operand in_list can be applied to attribute code and the reference value is a list of values
             terminologyId: [eq: 'value']
          ],
          [
             value: [contains: 'value']
          ]
       ]
    }
    
    static List attributes()
    {
       return ['value', 'code', 'terminologyId']
    }
}
