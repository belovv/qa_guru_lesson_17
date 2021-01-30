import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CartResponse {

    private Boolean success;
    private String message;
    private String updatetopcartsectionhtml;


    public String getUpdatetopcartsectionhtml() {
        return updatetopcartsectionhtml;
    }

    public void setUpdatetopcartsectionhtml(String updatetopcartsectionhtml) {
        this.updatetopcartsectionhtml = updatetopcartsectionhtml;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
