package springbootcrud.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends  RuntimeException{
    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : %s ", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldNae = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldNae() {
        return fieldNae;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    private  String resourceName;
    private  String  fieldNae;

    private  Object fieldValue;

}
