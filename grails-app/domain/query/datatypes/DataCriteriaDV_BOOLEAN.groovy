package query.datatypes

import query.DataCriteria

class DataCriteriaDV_BOOLEAN extends DataCriteria {

    Boolean valueValue

    String valueOperand

   
    DataCriteriaDV_BOOLEAN()
    {
       rmTypeName = 'DV_BOOLEAN'
       alias = 'dbi'
    }
    
    static constraints = {
    }
    static mapping = {
       valueValue column: "dv_boolean_value"
    }
    
    /**
     * Metadata that defines the types of criteria supported to search
     * by conditions over DV_QUANTITY.
     * @return
     */
    static List criteriaSpec()
    {
       return [
          [
             value: [
                eq:  'value'
             ]
          ]
       ]
    }
    
    static List attributes()
    {
       return ['value']
    }
}
